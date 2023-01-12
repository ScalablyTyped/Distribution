package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPendingWrites extends StObject {
  
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  
  var errorCode: js.UndefOr[typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.Code] = js.undefined
  
  var fromCache: js.UndefOr[Boolean] = js.undefined
  
  var hasPendingWrites: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[js.Array[Document]] = js.undefined
  
  var modified: js.UndefOr[js.Array[Document]] = js.undefined
  
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}
object HasPendingWrites {
  
  inline def apply(): HasPendingWrites = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPendingWrites]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasPendingWrites] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[Document]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: Document*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setErrorCode(value: typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.Code): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
    
    inline def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    
    inline def setHasPendingWritesUndefined: Self = StObject.set(x, "hasPendingWrites", js.undefined)
    
    inline def setMetadata(value: js.Array[Document]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: Document*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setModified(value: js.Array[Document]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setModifiedVarargs(value: Document*): Self = StObject.set(x, "modified", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Document]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: Document*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
