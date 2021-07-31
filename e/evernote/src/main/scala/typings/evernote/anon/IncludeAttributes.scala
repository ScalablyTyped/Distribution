package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeAttributes extends StObject {
  
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  var includeContentLength: js.UndefOr[Boolean] = js.undefined
  
  var includeCreated: js.UndefOr[Boolean] = js.undefined
  
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  
  var includeLargestResourceMime: js.UndefOr[Boolean] = js.undefined
  
  var includeLargestResourceSize: js.UndefOr[Boolean] = js.undefined
  
  var includeNotebookGuid: js.UndefOr[Boolean] = js.undefined
  
  var includeTagGuids: js.UndefOr[Boolean] = js.undefined
  
  var includeTitle: js.UndefOr[Boolean] = js.undefined
  
  var includeUpdateSequenceNum: js.UndefOr[Boolean] = js.undefined
  
  var includeUpdated: js.UndefOr[Boolean] = js.undefined
}
object IncludeAttributes {
  
  @scala.inline
  def apply(): IncludeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributes]
  }
  
  @scala.inline
  implicit class IncludeAttributesMutableBuilder[Self <: IncludeAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
    
    @scala.inline
    def setIncludeCreated(value: Boolean): Self = StObject.set(x, "includeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCreatedUndefined: Self = StObject.set(x, "includeCreated", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    @scala.inline
    def setIncludeLargestResourceMime(value: Boolean): Self = StObject.set(x, "includeLargestResourceMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLargestResourceMimeUndefined: Self = StObject.set(x, "includeLargestResourceMime", js.undefined)
    
    @scala.inline
    def setIncludeLargestResourceSize(value: Boolean): Self = StObject.set(x, "includeLargestResourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLargestResourceSizeUndefined: Self = StObject.set(x, "includeLargestResourceSize", js.undefined)
    
    @scala.inline
    def setIncludeNotebookGuid(value: Boolean): Self = StObject.set(x, "includeNotebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNotebookGuidUndefined: Self = StObject.set(x, "includeNotebookGuid", js.undefined)
    
    @scala.inline
    def setIncludeTagGuids(value: Boolean): Self = StObject.set(x, "includeTagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTagGuidsUndefined: Self = StObject.set(x, "includeTagGuids", js.undefined)
    
    @scala.inline
    def setIncludeTitle(value: Boolean): Self = StObject.set(x, "includeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTitleUndefined: Self = StObject.set(x, "includeTitle", js.undefined)
    
    @scala.inline
    def setIncludeUpdateSequenceNum(value: Boolean): Self = StObject.set(x, "includeUpdateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUpdateSequenceNumUndefined: Self = StObject.set(x, "includeUpdateSequenceNum", js.undefined)
    
    @scala.inline
    def setIncludeUpdated(value: Boolean): Self = StObject.set(x, "includeUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUpdatedUndefined: Self = StObject.set(x, "includeUpdated", js.undefined)
  }
}
