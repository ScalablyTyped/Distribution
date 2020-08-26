package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchResource extends js.Object {
  var address: String = js.native
  var expiration: Double = js.native
  var id: String = js.native
  var token: String = js.native
  var `type`: String = js.native
}

object WatchResource {
  @scala.inline
  def apply(address: String, expiration: Double, id: String, token: String, `type`: String): WatchResource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchResource]
  }
  @scala.inline
  implicit class WatchResourceOps[Self <: WatchResource] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

