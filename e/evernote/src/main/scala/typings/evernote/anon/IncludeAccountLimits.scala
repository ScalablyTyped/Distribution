package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAccountLimits extends js.Object {
  
  var includeAccountLimits: js.UndefOr[Boolean] = js.native
  
  var includeContent: js.UndefOr[Boolean] = js.native
  
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.native
  
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.native
  
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.native
  
  var includeResourcesData: js.UndefOr[Boolean] = js.native
  
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.native
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
}
object IncludeAccountLimits {
  
  @scala.inline
  def apply(): IncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccountLimits]
  }
  
  @scala.inline
  implicit class IncludeAccountLimitsOps[Self <: IncludeAccountLimits] (val x: Self) extends AnyVal {
    
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
    def setIncludeAccountLimits(value: Boolean): Self = this.set("includeAccountLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAccountLimits: Self = this.set("includeAccountLimits", js.undefined)
    
    @scala.inline
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeContent: Self = this.set("includeContent", js.undefined)
    
    @scala.inline
    def setIncludeNoteAppDataValues(value: Boolean): Self = this.set("includeNoteAppDataValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNoteAppDataValues: Self = this.set("includeNoteAppDataValues", js.undefined)
    
    @scala.inline
    def setIncludeResourceAppDataValues(value: Boolean): Self = this.set("includeResourceAppDataValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourceAppDataValues: Self = this.set("includeResourceAppDataValues", js.undefined)
    
    @scala.inline
    def setIncludeResourcesAlternateData(value: Boolean): Self = this.set("includeResourcesAlternateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourcesAlternateData: Self = this.set("includeResourcesAlternateData", js.undefined)
    
    @scala.inline
    def setIncludeResourcesData(value: Boolean): Self = this.set("includeResourcesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourcesData: Self = this.set("includeResourcesData", js.undefined)
    
    @scala.inline
    def setIncludeResourcesRecognition(value: Boolean): Self = this.set("includeResourcesRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourcesRecognition: Self = this.set("includeResourcesRecognition", js.undefined)
    
    @scala.inline
    def setIncludeSharedNotes(value: Boolean): Self = this.set("includeSharedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSharedNotes: Self = this.set("includeSharedNotes", js.undefined)
  }
}
