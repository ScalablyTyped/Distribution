package typings.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: String
  var v: String
}

object Client {
  @scala.inline
  def apply(client: String, v: String): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

