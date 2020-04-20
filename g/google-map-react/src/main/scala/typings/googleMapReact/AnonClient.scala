package typings.googleMapReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: String
  var v: String
}

object AnonClient {
  @scala.inline
  def apply(client: String, v: String): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

