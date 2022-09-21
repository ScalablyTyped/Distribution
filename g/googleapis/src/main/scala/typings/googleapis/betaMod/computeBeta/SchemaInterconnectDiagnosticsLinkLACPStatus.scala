package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnosticsLinkLACPStatus extends StObject {
  
  /**
    * System ID of the port on Google's side of the LACP exchange.
    */
  var googleSystemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System ID of the port on the neighbor's side of the LACP exchange.
    */
  var neighborSystemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of a LACP link, which can take one of the following values: - ACTIVE: The link is configured and active within the bundle. - DETACHED: The link is not configured within the bundle. This means that the rest of the object should be empty.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectDiagnosticsLinkLACPStatus {
  
  inline def apply(): SchemaInterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkLACPStatus]
  }
  
  extension [Self <: SchemaInterconnectDiagnosticsLinkLACPStatus](x: Self) {
    
    inline def setGoogleSystemId(value: String): Self = StObject.set(x, "googleSystemId", value.asInstanceOf[js.Any])
    
    inline def setGoogleSystemIdNull: Self = StObject.set(x, "googleSystemId", null)
    
    inline def setGoogleSystemIdUndefined: Self = StObject.set(x, "googleSystemId", js.undefined)
    
    inline def setNeighborSystemId(value: String): Self = StObject.set(x, "neighborSystemId", value.asInstanceOf[js.Any])
    
    inline def setNeighborSystemIdNull: Self = StObject.set(x, "neighborSystemId", null)
    
    inline def setNeighborSystemIdUndefined: Self = StObject.set(x, "neighborSystemId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
