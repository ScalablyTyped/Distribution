package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  
  var contentLength: js.UndefOr[Double] = js.undefined
  
  var created: js.UndefOr[Timestamp] = js.undefined
  
  var deleted: js.UndefOr[Timestamp] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var largestResourceMime: js.UndefOr[String] = js.undefined
  
  var largestResourceSize: js.UndefOr[Double] = js.undefined
  
  var notebookGuid: js.UndefOr[String] = js.undefined
  
  var tagGuids: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[Timestamp] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: NoteAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    inline def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDeleted(value: Timestamp): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setLargestResourceMime(value: String): Self = StObject.set(x, "largestResourceMime", value.asInstanceOf[js.Any])
    
    inline def setLargestResourceMimeUndefined: Self = StObject.set(x, "largestResourceMime", js.undefined)
    
    inline def setLargestResourceSize(value: Double): Self = StObject.set(x, "largestResourceSize", value.asInstanceOf[js.Any])
    
    inline def setLargestResourceSizeUndefined: Self = StObject.set(x, "largestResourceSize", js.undefined)
    
    inline def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    inline def setTagGuids(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    inline def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    inline def setTagGuidsVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "tagGuids", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    inline def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
