package typings.firebaseFirestore.distPrivateMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distPrivateMod.ApiClientObjectMap
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
  
  extension [Self <: AggregationResult](x: Self) {
    
    inline def setAggregateFields(value: ApiClientObjectMap[Value]): Self = StObject.set(x, "aggregateFields", value.asInstanceOf[js.Any])
    
    inline def setAggregateFieldsUndefined: Self = StObject.set(x, "aggregateFields", js.undefined)
  }
}
