package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drive extends js.Object {
  
  var backgroundImageFile: js.UndefOr[DriveBackgroundImageFile] = js.native
  
  var backgroundImageLink: js.UndefOr[String] = js.native
  
  var capabilities: js.UndefOr[DriveCapabilities] = js.native
  
  var colorRgb: js.UndefOr[String] = js.native
  
  var createdDate: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var restrictions: js.UndefOr[DriveRestrictions] = js.native
  
  var themeId: js.UndefOr[String] = js.native
}
object Drive {
  
  @scala.inline
  def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    
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
    def setBackgroundImageFile(value: DriveBackgroundImageFile): Self = this.set("backgroundImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageFile: Self = this.set("backgroundImageFile", js.undefined)
    
    @scala.inline
    def setBackgroundImageLink(value: String): Self = this.set("backgroundImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageLink: Self = this.set("backgroundImageLink", js.undefined)
    
    @scala.inline
    def setCapabilities(value: DriveCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setColorRgb(value: String): Self = this.set("colorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRgb: Self = this.set("colorRgb", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRestrictions(value: DriveRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    
    @scala.inline
    def setThemeId(value: String): Self = this.set("themeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeId: Self = this.set("themeId", js.undefined)
  }
}
