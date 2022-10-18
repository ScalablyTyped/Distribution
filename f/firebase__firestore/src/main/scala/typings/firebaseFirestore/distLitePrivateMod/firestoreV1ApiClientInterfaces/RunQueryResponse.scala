package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryResponse extends StObject {
  
  var document: js.UndefOr[Document] = js.undefined
  
  var readTime: js.UndefOr[String] = js.undefined
  
  var skippedResults: js.UndefOr[Double] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object RunQueryResponse {
  
  inline def apply(): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryResponse]
  }
  
  extension [Self <: RunQueryResponse](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setSkippedResults(value: Double): Self = StObject.set(x, "skippedResults", value.asInstanceOf[js.Any])
    
    inline def setSkippedResultsUndefined: Self = StObject.set(x, "skippedResults", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
