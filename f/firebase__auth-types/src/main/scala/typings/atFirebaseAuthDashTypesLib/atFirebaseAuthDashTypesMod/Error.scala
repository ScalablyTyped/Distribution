package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Error]
  }
}

