package typings.evernote.anon

import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.NotebookDescriptor
import typings.evernote.mod.Types.RelatedContent
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheExpires extends js.Object {
  
  var cacheExpires: js.UndefOr[Double] = js.native
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.native
  
  var debugInfo: js.UndefOr[String] = js.native
  
  var experts: js.UndefOr[js.Array[UserProfile]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.native
  
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
object CacheExpires {
  
  @scala.inline
  def apply(): CacheExpires = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheExpires]
  }
  
  @scala.inline
  implicit class CacheExpiresOps[Self <: CacheExpires] (val x: Self) extends AnyVal {
    
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
    def setCacheExpires(value: Double): Self = this.set("cacheExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheExpires: Self = this.set("cacheExpires", js.undefined)
    
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    
    @scala.inline
    def setContainingNotebooksVarargs(value: NotebookDescriptor*): Self = this.set("containingNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setContainingNotebooks(value: js.Array[NotebookDescriptor]): Self = this.set("containingNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainingNotebooks: Self = this.set("containingNotebooks", js.undefined)
    
    @scala.inline
    def setDebugInfo(value: String): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    
    @scala.inline
    def setExpertsVarargs(value: UserProfile*): Self = this.set("experts", js.Array(value :_*))
    
    @scala.inline
    def setExperts(value: js.Array[UserProfile]): Self = this.set("experts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperts: Self = this.set("experts", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = this.set("notebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = this.set("notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebooks: Self = this.set("notebooks", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: typings.evernote.mod.Types.Note*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typings.evernote.mod.Types.Note]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setRelatedContentVarargs(value: RelatedContent*): Self = this.set("relatedContent", js.Array(value :_*))
    
    @scala.inline
    def setRelatedContent(value: js.Array[RelatedContent]): Self = this.set("relatedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedContent: Self = this.set("relatedContent", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
