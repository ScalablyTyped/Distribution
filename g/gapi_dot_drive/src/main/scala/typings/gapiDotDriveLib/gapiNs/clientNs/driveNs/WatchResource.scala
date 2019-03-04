package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResource extends js.Object {
  var address: java.lang.String
  var expiration: scala.Double
  var id: java.lang.String
  var token: java.lang.String
  var `type`: java.lang.String
}

object WatchResource {
  @scala.inline
  def apply(
    address: java.lang.String,
    expiration: scala.Double,
    id: java.lang.String,
    token: java.lang.String,
    `type`: java.lang.String
  ): WatchResource = {
    val __obj = js.Dynamic.literal(address = address, expiration = expiration, id = id, token = token)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WatchResource]
  }
}

