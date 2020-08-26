package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeTlsChannelId extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the
    * connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.native
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object IncludeTlsChannelId {
  @scala.inline
  def apply(): IncludeTlsChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeTlsChannelId]
  }
  @scala.inline
  implicit class IncludeTlsChannelIdOps[Self <: IncludeTlsChannelId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeTlsChannelId(value: Boolean): Self = this.set("includeTlsChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTlsChannelId: Self = this.set("includeTlsChannelId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

