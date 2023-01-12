package typings.evernote.anon

import typings.evernote.mod.Types.RelatedContentType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeContainingNotebooks extends StObject {
  
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.undefined
  
  var includeDebugInfo: js.UndefOr[Boolean] = js.undefined
  
  var maxExperts: js.UndefOr[Double] = js.undefined
  
  var maxNotebooks: js.UndefOr[Double] = js.undefined
  
  var maxNotes: js.UndefOr[Double] = js.undefined
  
  var maxRelatedContent: js.UndefOr[Double] = js.undefined
  
  var maxTags: js.UndefOr[Double] = js.undefined
  
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.undefined
  
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.undefined
}
object IncludeContainingNotebooks {
  
  inline def apply(): IncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeContainingNotebooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeContainingNotebooks] (val x: Self) extends AnyVal {
    
    inline def setIncludeContainingNotebooks(value: Boolean): Self = StObject.set(x, "includeContainingNotebooks", value.asInstanceOf[js.Any])
    
    inline def setIncludeContainingNotebooksUndefined: Self = StObject.set(x, "includeContainingNotebooks", js.undefined)
    
    inline def setIncludeDebugInfo(value: Boolean): Self = StObject.set(x, "includeDebugInfo", value.asInstanceOf[js.Any])
    
    inline def setIncludeDebugInfoUndefined: Self = StObject.set(x, "includeDebugInfo", js.undefined)
    
    inline def setMaxExperts(value: Double): Self = StObject.set(x, "maxExperts", value.asInstanceOf[js.Any])
    
    inline def setMaxExpertsUndefined: Self = StObject.set(x, "maxExperts", js.undefined)
    
    inline def setMaxNotebooks(value: Double): Self = StObject.set(x, "maxNotebooks", value.asInstanceOf[js.Any])
    
    inline def setMaxNotebooksUndefined: Self = StObject.set(x, "maxNotebooks", js.undefined)
    
    inline def setMaxNotes(value: Double): Self = StObject.set(x, "maxNotes", value.asInstanceOf[js.Any])
    
    inline def setMaxNotesUndefined: Self = StObject.set(x, "maxNotes", js.undefined)
    
    inline def setMaxRelatedContent(value: Double): Self = StObject.set(x, "maxRelatedContent", value.asInstanceOf[js.Any])
    
    inline def setMaxRelatedContentUndefined: Self = StObject.set(x, "maxRelatedContent", js.undefined)
    
    inline def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
    
    inline def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
    
    inline def setRelatedContentTypes(value: Set[RelatedContentType]): Self = StObject.set(x, "relatedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setRelatedContentTypesUndefined: Self = StObject.set(x, "relatedContentTypes", js.undefined)
    
    inline def setWritableNotebooksOnly(value: Boolean): Self = StObject.set(x, "writableNotebooksOnly", value.asInstanceOf[js.Any])
    
    inline def setWritableNotebooksOnlyUndefined: Self = StObject.set(x, "writableNotebooksOnly", js.undefined)
  }
}
