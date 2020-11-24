package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSettings extends js.Object {
  
  /** Sets import mapper to perform import feature in Spreadsheet.
    */
  var importMapper: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable import while initial loading.
    * @Default {false}
    */
  var importOnLoad: js.UndefOr[Boolean] = js.native
  
  /** Sets import URL to access the online files in the Spreadsheet.
    */
  var importUrl: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates to define password while importing in the Spreadsheet.
    */
  var password: js.UndefOr[String] = js.native
}
object ImportSettings {
  
  @scala.inline
  def apply(): ImportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSettings]
  }
  
  @scala.inline
  implicit class ImportSettingsOps[Self <: ImportSettings] (val x: Self) extends AnyVal {
    
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
    def setImportMapper(value: String): Self = this.set("importMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportMapper: Self = this.set("importMapper", js.undefined)
    
    @scala.inline
    def setImportOnLoad(value: Boolean): Self = this.set("importOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportOnLoad: Self = this.set("importOnLoad", js.undefined)
    
    @scala.inline
    def setImportUrl(value: String): Self = this.set("importUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportUrl: Self = this.set("importUrl", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
