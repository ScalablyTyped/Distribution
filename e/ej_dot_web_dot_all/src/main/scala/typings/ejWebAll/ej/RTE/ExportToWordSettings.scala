package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportToWordSettings extends js.Object {
  
  /** Specifies the file name for the exported word file.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /** This API is used to receive the server-side handler for export related operations.
    */
  var url: js.UndefOr[String] = js.native
}
object ExportToWordSettings {
  
  @scala.inline
  def apply(): ExportToWordSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToWordSettings]
  }
  
  @scala.inline
  implicit class ExportToWordSettingsOps[Self <: ExportToWordSettings] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
