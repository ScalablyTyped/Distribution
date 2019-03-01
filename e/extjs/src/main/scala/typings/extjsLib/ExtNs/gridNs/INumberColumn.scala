package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberColumn
  extends extjsLib.ExtNs.gridNs.columnNs.IColumn {
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object INumberColumn {
  @scala.inline
  def apply(IColumn: extjsLib.ExtNs.gridNs.columnNs.IColumn = null, format: java.lang.String = null): INumberColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[INumberColumn]
  }
}

