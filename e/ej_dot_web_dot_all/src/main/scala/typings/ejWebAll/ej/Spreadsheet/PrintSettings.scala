package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintSettings extends js.Object {
  
  /** Gets or sets a value that indicates whether to enable or disable page setup support for printing in Spreadsheet.
    * @Default {true}
    */
  var allowPageSetup: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable page size support for printing in Spreadsheet.
    * @Default {false}
    */
  var allowPageSize: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable print feature in the Spreadsheet.
    * @Default {true}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.native
}
object PrintSettings {
  
  @scala.inline
  def apply(): PrintSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintSettings]
  }
  
  @scala.inline
  implicit class PrintSettingsOps[Self <: PrintSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowPageSetup(value: Boolean): Self = this.set("allowPageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPageSetup: Self = this.set("allowPageSetup", js.undefined)
    
    @scala.inline
    def setAllowPageSize(value: Boolean): Self = this.set("allowPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPageSize: Self = this.set("allowPageSize", js.undefined)
    
    @scala.inline
    def setAllowPrinting(value: Boolean): Self = this.set("allowPrinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPrinting: Self = this.set("allowPrinting", js.undefined)
  }
}
