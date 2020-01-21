package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResource extends js.Object {
  var address: String
  var expiration: Double
  var id: String
  var token: String
  var `type`: String
}

object WatchResource {
  @scala.inline
  def apply(address: String, expiration: Double, id: String, token: String, `type`: String): WatchResource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchResource]
  }
}

