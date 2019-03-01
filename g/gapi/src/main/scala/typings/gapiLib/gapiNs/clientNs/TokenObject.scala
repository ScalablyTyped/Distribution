package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenObject extends js.Object {
  /**
    * The access token to use in requests.
    */
  var access_token: java.lang.String
}

object TokenObject {
  @scala.inline
  def apply(access_token: java.lang.String): TokenObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.asInstanceOf[TokenObject]
  }
}

