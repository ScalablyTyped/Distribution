package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupSettings extends js.Object {
  /** Gets or sets a value that customize the group caption format.
    * @Default {null}
    */
  var captionFormat: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to enable animation button option in the group drop area of the grid.
    * @Default {false}
    */
  var enableDropAreaAutoSizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add grouped columns programmatically at initial load
    * @Default {[]}
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to show the group drop area just above the column header. It can be used to avoid ungrouping the already grouped column using
    * groupSettings.
    * @Default {true}
    */
  var showDropArea: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to hide the grouped columns from the grid
    * @Default {false}
    */
  var showGroupedColumn: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show the group button image(toggle button)in the column header and also in the grouped column in the group drop area . It can be
    * used to group/ungroup the columns by click on the toggle button.
    * @Default {false}
    */
  var showToggleButton: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the close button in the grouped column which is in the group drop area to ungroup the grouped column
    * @Default {false}
    */
  var showUngroupButton: js.UndefOr[Boolean] = js.native
}

object GroupSettings {
  @scala.inline
  def apply(): GroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSettings]
  }
  @scala.inline
  implicit class GroupSettingsOps[Self <: GroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptionFormat(value: String): Self = this.set("captionFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionFormat: Self = this.set("captionFormat", js.undefined)
    @scala.inline
    def setEnableDropAreaAutoSizing(value: Boolean): Self = this.set("enableDropAreaAutoSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDropAreaAutoSizing: Self = this.set("enableDropAreaAutoSizing", js.undefined)
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = this.set("groupedColumns", js.Array(value :_*))
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = this.set("groupedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupedColumns: Self = this.set("groupedColumns", js.undefined)
    @scala.inline
    def setShowDropArea(value: Boolean): Self = this.set("showDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDropArea: Self = this.set("showDropArea", js.undefined)
    @scala.inline
    def setShowGroupedColumn(value: Boolean): Self = this.set("showGroupedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGroupedColumn: Self = this.set("showGroupedColumn", js.undefined)
    @scala.inline
    def setShowToggleButton(value: Boolean): Self = this.set("showToggleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToggleButton: Self = this.set("showToggleButton", js.undefined)
    @scala.inline
    def setShowUngroupButton(value: Boolean): Self = this.set("showUngroupButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowUngroupButton: Self = this.set("showUngroupButton", js.undefined)
  }
  
}

