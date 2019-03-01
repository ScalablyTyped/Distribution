package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var errcode: java.lang.String
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(errcode: java.lang.String, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errcode")(errcode)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Error]
  }
}

