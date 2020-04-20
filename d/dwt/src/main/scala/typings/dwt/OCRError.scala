package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRError extends js.Object {
  var errorString: String
  var responseText: String
}

object OCRError {
  @scala.inline
  def apply(errorString: String, responseText: String): OCRError = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCRError]
  }
}

