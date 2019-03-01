package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeSettings extends js.Object {
  /** Specifies the mode for column resizing
    * @Default {ej.TreeGrid.ColumnResizeMode.Normal}
    */
  var columnResizeMode: js.UndefOr[ColumnResizeMode | java.lang.String] = js.undefined
}

object ColumnResizeSettings {
  @scala.inline
  def apply(columnResizeMode: ColumnResizeMode | java.lang.String = null): ColumnResizeSettings = {
    val __obj = js.Dynamic.literal()
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizeSettings]
  }
}

