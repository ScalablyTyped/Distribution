package typings.googleLibphonenumber.libphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsYouTypeFormatter extends js.Object {
  def clear(): Unit
  def inputDigit(digit: String): String
}

object AsYouTypeFormatter {
  @scala.inline
  def apply(clear: () => Unit, inputDigit: String => String): AsYouTypeFormatter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), inputDigit = js.Any.fromFunction1(inputDigit))
    __obj.asInstanceOf[AsYouTypeFormatter]
  }
}

