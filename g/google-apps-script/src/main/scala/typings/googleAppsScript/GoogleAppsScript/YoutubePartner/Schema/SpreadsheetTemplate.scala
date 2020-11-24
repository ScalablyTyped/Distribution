package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetTemplate extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var templateContent: js.UndefOr[String] = js.native
  
  var templateName: js.UndefOr[String] = js.native
  
  var templateType: js.UndefOr[String] = js.native
}
object SpreadsheetTemplate {
  
  @scala.inline
  def apply(): SpreadsheetTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetTemplate]
  }
  
  @scala.inline
  implicit class SpreadsheetTemplateOps[Self <: SpreadsheetTemplate] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTemplateContent(value: String): Self = this.set("templateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateContent: Self = this.set("templateContent", js.undefined)
    
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    
    @scala.inline
    def setTemplateType(value: String): Self = this.set("templateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateType: Self = this.set("templateType", js.undefined)
  }
}
