package typings.ejWebAll.ej.DocumentEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExportSettings extends js.Object {
  
  /** Gets or sets URL of Web API that should be used to parse the document while loading.
    */
  var importUrl: js.UndefOr[String] = js.native
}
object ImportExportSettings {
  
  @scala.inline
  def apply(): ImportExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportExportSettings]
  }
  
  @scala.inline
  implicit class ImportExportSettingsOps[Self <: ImportExportSettings] (val x: Self) extends AnyVal {
    
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
    def setImportUrl(value: String): Self = this.set("importUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportUrl: Self = this.set("importUrl", js.undefined)
  }
}
