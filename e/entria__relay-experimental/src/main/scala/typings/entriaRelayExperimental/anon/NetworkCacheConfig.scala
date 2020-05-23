package typings.entriaRelayExperimental.anon

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.undefined
}

object NetworkCacheConfig {
  @scala.inline
  def apply(networkCacheConfig: CacheConfig = null): NetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCacheConfig]
  }
}

