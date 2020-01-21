package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStyleOptions extends js.Object {
  /** Pass the number format object
    */
  var NumFormat: js.UndefOr[js.Any] = js.undefined
  /** Pass the style object
    */
  var style: js.UndefOr[js.Any] = js.undefined
}

object CustomStyleOptions {
  @scala.inline
  def apply(NumFormat: js.Any = null, style: js.Any = null): CustomStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (NumFormat != null) __obj.updateDynamic("NumFormat")(NumFormat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleOptions]
  }
}

