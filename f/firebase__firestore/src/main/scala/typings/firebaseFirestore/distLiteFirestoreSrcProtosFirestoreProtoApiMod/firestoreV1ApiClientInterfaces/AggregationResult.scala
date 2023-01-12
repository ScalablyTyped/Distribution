package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationResult extends StObject {
  
  var aggregateFields: js.UndefOr[ApiClientObjectMap[Value]] = js.undefined
}
object AggregationResult {
  
  inline def apply(): AggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationResult] (val x: Self) extends AnyVal {
    
    inline def setAggregateFields(value: ApiClientObjectMap[Value]): Self = StObject.set(x, "aggregateFields", value.asInstanceOf[js.Any])
    
    inline def setAggregateFieldsUndefined: Self = StObject.set(x, "aggregateFields", js.undefined)
  }
}
