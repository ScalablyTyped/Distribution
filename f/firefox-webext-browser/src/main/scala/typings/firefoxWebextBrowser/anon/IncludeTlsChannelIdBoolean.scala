package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeTlsChannelIdBoolean extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the
    * connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}

object IncludeTlsChannelIdBoolean {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[Boolean] = js.undefined): IncludeTlsChannelIdBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeTlsChannelIdBoolean]
  }
}

