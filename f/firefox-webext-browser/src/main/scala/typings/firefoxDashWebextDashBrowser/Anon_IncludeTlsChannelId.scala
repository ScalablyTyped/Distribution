package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeTlsChannelId extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the
    * connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}

object Anon_IncludeTlsChannelId {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[Boolean] = js.undefined, name: String = null): Anon_IncludeTlsChannelId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeTlsChannelId]
  }
}

