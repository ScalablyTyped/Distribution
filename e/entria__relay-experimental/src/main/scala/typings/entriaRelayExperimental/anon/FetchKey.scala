package typings.entriaRelayExperimental.anon

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchKey extends js.Object {
  var fetchKey: js.UndefOr[String | Double] = js.undefined
  var fetchPolicy: js.UndefOr[typings.entriaRelayExperimental.queryResourceMod.FetchPolicy] = js.undefined
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.undefined
}

object FetchKey {
  @scala.inline
  def apply(
    fetchKey: String | Double = null,
    fetchPolicy: typings.entriaRelayExperimental.queryResourceMod.FetchPolicy = null,
    networkCacheConfig: CacheConfig = null
  ): FetchKey = {
    val __obj = js.Dynamic.literal()
    if (fetchKey != null) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchKey]
  }
}

