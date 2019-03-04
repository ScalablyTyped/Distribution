package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinaryValue extends js.Object {
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
    */
  var binaryValue: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Name of the HTTP header. */
  var name: java.lang.String
  /** Value of the HTTP header if it can be represented by UTF-8. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BinaryValue {
  @scala.inline
  def apply(name: java.lang.String, binaryValue: js.Array[scala.Double] = null, value: java.lang.String = null): Anon_BinaryValue = {
    val __obj = js.Dynamic.literal(name = name)
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_BinaryValue]
  }
}

