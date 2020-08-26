package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates to define active cell in spreadsheet.
    */
  var activeCell: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define animation time while selection in the Spreadsheet.
    * @Default {0.001}
    */
  var animationTime: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to enable or disable animation while selection.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to set selection type in Spreadsheet. It has three types which are Column, Row and Default.
    * @Default {ej.Spreadsheet.SelectionType.Default}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Gets or sets a value that indicates to set selection unit in Spreadsheet. It has three types which are Single, Range and MultiRange.
    * @Default {ej.Spreadsheet.SelectionUnit.MultiRange}
    */
  var selectionUnit: js.UndefOr[SelectionUnit | String] = js.native
}

object SelectionSettings {
  @scala.inline
  def apply(): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionSettings]
  }
  @scala.inline
  implicit class SelectionSettingsOps[Self <: SelectionSettings] (val x: Self) extends AnyVal {
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
    def setActiveCell(value: String): Self = this.set("activeCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveCell: Self = this.set("activeCell", js.undefined)
    @scala.inline
    def setAnimationTime(value: Double): Self = this.set("animationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTime: Self = this.set("animationTime", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setSelectionType(value: SelectionType | String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setSelectionUnit(value: SelectionUnit | String): Self = this.set("selectionUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionUnit: Self = this.set("selectionUnit", js.undefined)
  }
  
}

