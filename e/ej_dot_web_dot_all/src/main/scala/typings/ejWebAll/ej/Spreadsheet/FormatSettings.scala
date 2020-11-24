package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatSettings extends js.Object {
  
  /** Gets or sets a value that indicates whether to enable or disable cell border feature in the Spreadsheet.
    * @Default {true}
    */
  var allowCellBorder: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable decimal places in the Spreadsheet.
    * @Default {true}
    */
  var allowDecimalPlaces: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable font family feature in Spreadsheet.
    * @Default {true}
    */
  var allowFontFamily: js.UndefOr[Boolean] = js.native
}
object FormatSettings {
  
  @scala.inline
  def apply(): FormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatSettings]
  }
  
  @scala.inline
  implicit class FormatSettingsOps[Self <: FormatSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowCellBorder(value: Boolean): Self = this.set("allowCellBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCellBorder: Self = this.set("allowCellBorder", js.undefined)
    
    @scala.inline
    def setAllowDecimalPlaces(value: Boolean): Self = this.set("allowDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimalPlaces: Self = this.set("allowDecimalPlaces", js.undefined)
    
    @scala.inline
    def setAllowFontFamily(value: Boolean): Self = this.set("allowFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontFamily: Self = this.set("allowFontFamily", js.undefined)
  }
}
