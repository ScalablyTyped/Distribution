package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectCircuitInfo extends StObject {
  
  /**
    * Customer-side demarc ID for this circuit.
    */
  var customerDemarcId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
    */
  var googleCircuitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
    */
  var googleDemarcId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectCircuitInfo {
  
  inline def apply(): SchemaInterconnectCircuitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectCircuitInfo]
  }
  
  extension [Self <: SchemaInterconnectCircuitInfo](x: Self) {
    
    inline def setCustomerDemarcId(value: String): Self = StObject.set(x, "customerDemarcId", value.asInstanceOf[js.Any])
    
    inline def setCustomerDemarcIdNull: Self = StObject.set(x, "customerDemarcId", null)
    
    inline def setCustomerDemarcIdUndefined: Self = StObject.set(x, "customerDemarcId", js.undefined)
    
    inline def setGoogleCircuitId(value: String): Self = StObject.set(x, "googleCircuitId", value.asInstanceOf[js.Any])
    
    inline def setGoogleCircuitIdNull: Self = StObject.set(x, "googleCircuitId", null)
    
    inline def setGoogleCircuitIdUndefined: Self = StObject.set(x, "googleCircuitId", js.undefined)
    
    inline def setGoogleDemarcId(value: String): Self = StObject.set(x, "googleDemarcId", value.asInstanceOf[js.Any])
    
    inline def setGoogleDemarcIdNull: Self = StObject.set(x, "googleDemarcId", null)
    
    inline def setGoogleDemarcIdUndefined: Self = StObject.set(x, "googleDemarcId", js.undefined)
  }
}
