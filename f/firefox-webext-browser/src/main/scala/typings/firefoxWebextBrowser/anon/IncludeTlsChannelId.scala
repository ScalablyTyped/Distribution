package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeTlsChannelId extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the
    * connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}

object IncludeTlsChannelId {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[Boolean] = js.undefined, name: String = null): IncludeTlsChannelId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeTlsChannelId]
  }
}

