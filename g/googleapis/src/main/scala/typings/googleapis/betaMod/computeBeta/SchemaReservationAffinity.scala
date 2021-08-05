package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllocationAffinity is the configuration of desired allocation which this
  * instance could take capacity from.
  */
trait SchemaReservationAffinity extends StObject {
  
  var consumeReservationType: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the label key of reservation resource.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the label values of reservation resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaReservationAffinity {
  
  inline def apply(): SchemaReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationAffinity]
  }
  
  extension [Self <: SchemaReservationAffinity](x: Self) {
    
    inline def setConsumeReservationType(value: String): Self = StObject.set(x, "consumeReservationType", value.asInstanceOf[js.Any])
    
    inline def setConsumeReservationTypeUndefined: Self = StObject.set(x, "consumeReservationType", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
