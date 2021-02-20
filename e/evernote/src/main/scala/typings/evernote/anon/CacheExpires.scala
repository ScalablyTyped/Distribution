package typings.evernote.anon

import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.NotebookDescriptor
import typings.evernote.mod.Types.RelatedContent
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.UserProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheExpires extends StObject {
  
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
  implicit class CacheExpiresMutableBuilder[Self <: CacheExpires] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheExpires(value: Double): Self = StObject.set(x, "cacheExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheExpiresUndefined: Self = StObject.set(x, "cacheExpires", js.undefined)
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    @scala.inline
    def setContainingNotebooks(value: js.Array[NotebookDescriptor]): Self = StObject.set(x, "containingNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainingNotebooksUndefined: Self = StObject.set(x, "containingNotebooks", js.undefined)
    
    @scala.inline
    def setContainingNotebooksVarargs(value: NotebookDescriptor*): Self = StObject.set(x, "containingNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    @scala.inline
    def setExperts(value: js.Array[UserProfile]): Self = StObject.set(x, "experts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertsUndefined: Self = StObject.set(x, "experts", js.undefined)
    
    @scala.inline
    def setExpertsVarargs(value: UserProfile*): Self = StObject.set(x, "experts", js.Array(value :_*))
    
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typings.evernote.mod.Types.Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: typings.evernote.mod.Types.Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setRelatedContent(value: js.Array[RelatedContent]): Self = StObject.set(x, "relatedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedContentUndefined: Self = StObject.set(x, "relatedContent", js.undefined)
    
    @scala.inline
    def setRelatedContentVarargs(value: RelatedContent*): Self = StObject.set(x, "relatedContent", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
