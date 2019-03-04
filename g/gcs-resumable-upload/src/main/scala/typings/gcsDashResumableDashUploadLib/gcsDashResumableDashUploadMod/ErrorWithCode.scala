package typings
package gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithCode
  extends nodeLib.Error {
  var code: scala.Double
}

object ErrorWithCode {
  @scala.inline
  def apply(code: scala.Double, stack: java.lang.String = null): ErrorWithCode = {
    val __obj = js.Dynamic.literal(code = code)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ErrorWithCode]
  }
}

