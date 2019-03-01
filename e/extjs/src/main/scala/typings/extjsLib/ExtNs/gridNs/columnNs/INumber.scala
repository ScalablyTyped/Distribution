package typings
package extjsLib.ExtNs.gridNs.columnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends IColumn {
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object INumber {
  @scala.inline
  def apply(IColumn: IColumn = null, format: java.lang.String = null): INumber = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[INumber]
  }
}

