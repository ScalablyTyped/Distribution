package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdnSettings extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var frameRate: js.UndefOr[String] = js.native
  
  var ingestionInfo: js.UndefOr[IngestionInfo] = js.native
  
  var ingestionType: js.UndefOr[String] = js.native
  
  var resolution: js.UndefOr[String] = js.native
}
object CdnSettings {
  
  @scala.inline
  def apply(): CdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdnSettings]
  }
  
  @scala.inline
  implicit class CdnSettingsOps[Self <: CdnSettings] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrameRate(value: String): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setIngestionInfo(value: IngestionInfo): Self = this.set("ingestionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionInfo: Self = this.set("ingestionInfo", js.undefined)
    
    @scala.inline
    def setIngestionType(value: String): Self = this.set("ingestionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionType: Self = this.set("ingestionType", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
