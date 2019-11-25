package typings.atEntriaRelayDashExperimental

import typings.atEntriaRelayDashExperimental.libQueryResourceMod.FetchPolicy
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchKey extends js.Object {
  var fetchKey: js.UndefOr[String | Double] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.undefined
}

object Anon_FetchKey {
  @scala.inline
  def apply(
    fetchKey: String | Double = null,
    fetchPolicy: FetchPolicy = null,
    networkCacheConfig: CacheConfig = null
  ): Anon_FetchKey = {
    val __obj = js.Dynamic.literal()
    if (fetchKey != null) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FetchKey]
  }
}

