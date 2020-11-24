package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  var layoutProperties: js.UndefOr[LayoutProperties] = js.native
  
  var masterProperties: js.UndefOr[MasterProperties] = js.native
  
  var notesProperties: js.UndefOr[NotesProperties] = js.native
  
  var objectId: js.UndefOr[String] = js.native
  
  var pageElements: js.UndefOr[js.Array[PageElement]] = js.native
  
  var pageProperties: js.UndefOr[PageProperties] = js.native
  
  var pageType: js.UndefOr[String] = js.native
  
  var revisionId: js.UndefOr[String] = js.native
  
  var slideProperties: js.UndefOr[SlideProperties] = js.native
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setLayoutProperties(value: LayoutProperties): Self = this.set("layoutProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutProperties: Self = this.set("layoutProperties", js.undefined)
    
    @scala.inline
    def setMasterProperties(value: MasterProperties): Self = this.set("masterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterProperties: Self = this.set("masterProperties", js.undefined)
    
    @scala.inline
    def setNotesProperties(value: NotesProperties): Self = this.set("notesProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotesProperties: Self = this.set("notesProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPageElementsVarargs(value: PageElement*): Self = this.set("pageElements", js.Array(value :_*))
    
    @scala.inline
    def setPageElements(value: js.Array[PageElement]): Self = this.set("pageElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageElements: Self = this.set("pageElements", js.undefined)
    
    @scala.inline
    def setPageProperties(value: PageProperties): Self = this.set("pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageProperties: Self = this.set("pageProperties", js.undefined)
    
    @scala.inline
    def setPageType(value: String): Self = this.set("pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageType: Self = this.set("pageType", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setSlideProperties(value: SlideProperties): Self = this.set("slideProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideProperties: Self = this.set("slideProperties", js.undefined)
  }
}
