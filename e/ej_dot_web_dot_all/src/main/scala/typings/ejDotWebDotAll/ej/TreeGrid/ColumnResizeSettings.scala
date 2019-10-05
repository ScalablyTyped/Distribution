package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeSettings extends js.Object {
  /** Specifies the mode for column resizing
    * @Default {ej.TreeGrid.ColumnResizeMode.Normal}
    */
  var columnResizeMode: js.UndefOr[ColumnResizeMode | String] = js.undefined
}

object ColumnResizeSettings {
  @scala.inline
  def apply(columnResizeMode: ColumnResizeMode | String = null): ColumnResizeSettings = {
    val __obj = js.Dynamic.literal()
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizeSettings]
  }
}

