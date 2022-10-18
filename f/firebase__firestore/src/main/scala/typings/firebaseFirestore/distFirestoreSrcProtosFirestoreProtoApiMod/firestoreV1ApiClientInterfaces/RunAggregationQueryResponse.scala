package typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunAggregationQueryResponse extends StObject {
  
  var readTime: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[AggregationResult] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object RunAggregationQueryResponse {
  
  inline def apply(): RunAggregationQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAggregationQueryResponse]
  }
  
  extension [Self <: RunAggregationQueryResponse](x: Self) {
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResult(value: AggregationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
