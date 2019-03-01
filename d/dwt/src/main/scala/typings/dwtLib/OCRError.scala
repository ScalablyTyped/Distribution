package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRError extends js.Object {
  var errorString: java.lang.String
  var responseText: java.lang.String
}

object OCRError {
  @scala.inline
  def apply(errorString: java.lang.String, responseText: java.lang.String): OCRError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorString")(errorString)
    __obj.updateDynamic("responseText")(responseText)
    __obj.asInstanceOf[OCRError]
  }
}

