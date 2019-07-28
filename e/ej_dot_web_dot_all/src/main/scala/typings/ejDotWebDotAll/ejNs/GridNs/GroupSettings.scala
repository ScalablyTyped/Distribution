package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSettings extends js.Object {
  /** Gets or sets a value that customize the group caption format.
    * @Default {null}
    */
  var captionFormat: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to enable animation button option in the group drop area of the grid.
    * @Default {false}
    */
  var enableDropAreaAutoSizing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add grouped columns programmatically at initial load
    * @Default {[]}
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to show the group drop area just above the column header. It can be used to avoid ungrouping the already grouped column using
    * groupSettings.
    * @Default {true}
    */
  var showDropArea: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to hide the grouped columns from the grid
    * @Default {false}
    */
  var showGroupedColumn: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the group button image(toggle button)in the column header and also in the grouped column in the group drop area . It can be
    * used to group/ungroup the columns by click on the toggle button.
    * @Default {false}
    */
  var showToggleButton: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the close button in the grouped column which is in the group drop area to ungroup the grouped column
    * @Default {false}
    */
  var showUngroupButton: js.UndefOr[Boolean] = js.undefined
}

object GroupSettings {
  @scala.inline
  def apply(
    captionFormat: String = null,
    enableDropAreaAutoSizing: js.UndefOr[Boolean] = js.undefined,
    groupedColumns: js.Array[_] = null,
    showDropArea: js.UndefOr[Boolean] = js.undefined,
    showGroupedColumn: js.UndefOr[Boolean] = js.undefined,
    showToggleButton: js.UndefOr[Boolean] = js.undefined,
    showUngroupButton: js.UndefOr[Boolean] = js.undefined
  ): GroupSettings = {
    val __obj = js.Dynamic.literal()
    if (captionFormat != null) __obj.updateDynamic("captionFormat")(captionFormat)
    if (!js.isUndefined(enableDropAreaAutoSizing)) __obj.updateDynamic("enableDropAreaAutoSizing")(enableDropAreaAutoSizing)
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns)
    if (!js.isUndefined(showDropArea)) __obj.updateDynamic("showDropArea")(showDropArea)
    if (!js.isUndefined(showGroupedColumn)) __obj.updateDynamic("showGroupedColumn")(showGroupedColumn)
    if (!js.isUndefined(showToggleButton)) __obj.updateDynamic("showToggleButton")(showToggleButton)
    if (!js.isUndefined(showUngroupButton)) __obj.updateDynamic("showUngroupButton")(showUngroupButton)
    __obj.asInstanceOf[GroupSettings]
  }
}

