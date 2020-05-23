package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryValue extends js.Object {
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
    */
  var binaryValue: js.UndefOr[js.Array[Double]] = js.undefined
  /** Name of the HTTP header. */
  var name: String
  /** Value of the HTTP header if it can be represented by UTF-8. */
  var value: js.UndefOr[String] = js.undefined
}

object BinaryValue {
  @scala.inline
  def apply(name: String, binaryValue: js.Array[Double] = null, value: String = null): BinaryValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryValue]
  }
}

