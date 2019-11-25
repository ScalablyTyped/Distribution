package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** Specifies the column collection for filtering the Gantt content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
}

object FilterSettings {
  @scala.inline
  def apply(filteredColumns: js.Array[FilterSettingsFilteredColumn] = null): FilterSettings = {
    val __obj = js.Dynamic.literal()
    if (filteredColumns != null) __obj.updateDynamic("filteredColumns")(filteredColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettings]
  }
}

