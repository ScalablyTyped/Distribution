package typings.gapiDotDrive.gapi.client.drive

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
    val __obj = js.Dynamic.literal(address = address, expiration = expiration, id = id, token = token)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WatchResource]
  }
}

