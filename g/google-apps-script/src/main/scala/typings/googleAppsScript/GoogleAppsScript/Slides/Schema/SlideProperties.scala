package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideProperties extends js.Object {
  
  var layoutObjectId: js.UndefOr[String] = js.native
  
  var masterObjectId: js.UndefOr[String] = js.native
  
  var notesPage: js.UndefOr[Page] = js.native
}
object SlideProperties {
  
  @scala.inline
  def apply(): SlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideProperties]
  }
  
  @scala.inline
  implicit class SlidePropertiesOps[Self <: SlideProperties] (val x: Self) extends AnyVal {
    
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
    def setLayoutObjectId(value: String): Self = this.set("layoutObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutObjectId: Self = this.set("layoutObjectId", js.undefined)
    
    @scala.inline
    def setMasterObjectId(value: String): Self = this.set("masterObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterObjectId: Self = this.set("masterObjectId", js.undefined)
    
    @scala.inline
    def setNotesPage(value: Page): Self = this.set("notesPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotesPage: Self = this.set("notesPage", js.undefined)
  }
}
