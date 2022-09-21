package typings.flexsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexOptionsForDocumentSearch[T, Store /* <: StoreOption */]
  extends StObject
     with IndexOptions[T, Store] {
  
  var document: js.UndefOr[(DocumentOptions[T, Store]) | (Descriptor[T, Store])] = js.undefined
  
  // Additional Options for Document Indexes
  var worker: js.UndefOr[Boolean] = js.undefined
}
object IndexOptionsForDocumentSearch {
  
  inline def apply[T, Store /* <: StoreOption */](): IndexOptionsForDocumentSearch[T, Store] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptionsForDocumentSearch[T, Store]]
  }
  
  extension [Self <: IndexOptionsForDocumentSearch[?, ?], T, Store /* <: StoreOption */](x: Self & (IndexOptionsForDocumentSearch[T, Store])) {
    
    inline def setDocument(value: (DocumentOptions[T, Store]) | (Descriptor[T, Store])): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
