package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var client_email: java.lang.String
  var private_key: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(client_email: java.lang.String, private_key: java.lang.String): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_email")(client_email)
    __obj.updateDynamic("private_key")(private_key)
    __obj.asInstanceOf[Credentials]
  }
}

