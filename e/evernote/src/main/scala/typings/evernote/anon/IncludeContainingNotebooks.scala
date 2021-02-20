package typings.evernote.anon

import typings.evernote.mod.Types.RelatedContentType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeContainingNotebooks extends StObject {
  
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  
  var maxExperts: js.UndefOr[Double] = js.native
  
  var maxNotebooks: js.UndefOr[Double] = js.native
  
  var maxNotes: js.UndefOr[Double] = js.native
  
  var maxRelatedContent: js.UndefOr[Double] = js.native
  
  var maxTags: js.UndefOr[Double] = js.native
  
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}
object IncludeContainingNotebooks {
  
  @scala.inline
  def apply(): IncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeContainingNotebooks]
  }
  
  @scala.inline
  implicit class IncludeContainingNotebooksMutableBuilder[Self <: IncludeContainingNotebooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeContainingNotebooks(value: Boolean): Self = StObject.set(x, "includeContainingNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeContainingNotebooksUndefined: Self = StObject.set(x, "includeContainingNotebooks", js.undefined)
    
    @scala.inline
    def setIncludeDebugInfo(value: Boolean): Self = StObject.set(x, "includeDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDebugInfoUndefined: Self = StObject.set(x, "includeDebugInfo", js.undefined)
    
    @scala.inline
    def setMaxExperts(value: Double): Self = StObject.set(x, "maxExperts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExpertsUndefined: Self = StObject.set(x, "maxExperts", js.undefined)
    
    @scala.inline
    def setMaxNotebooks(value: Double): Self = StObject.set(x, "maxNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNotebooksUndefined: Self = StObject.set(x, "maxNotebooks", js.undefined)
    
    @scala.inline
    def setMaxNotes(value: Double): Self = StObject.set(x, "maxNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNotesUndefined: Self = StObject.set(x, "maxNotes", js.undefined)
    
    @scala.inline
    def setMaxRelatedContent(value: Double): Self = StObject.set(x, "maxRelatedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRelatedContentUndefined: Self = StObject.set(x, "maxRelatedContent", js.undefined)
    
    @scala.inline
    def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
    
    @scala.inline
    def setRelatedContentTypes(value: Set[RelatedContentType]): Self = StObject.set(x, "relatedContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedContentTypesUndefined: Self = StObject.set(x, "relatedContentTypes", js.undefined)
    
    @scala.inline
    def setWritableNotebooksOnly(value: Boolean): Self = StObject.set(x, "writableNotebooksOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableNotebooksOnlyUndefined: Self = StObject.set(x, "writableNotebooksOnly", js.undefined)
  }
}
