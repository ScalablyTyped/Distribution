package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedureRequestRequester
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner or organization who initiated the request.
    */
  var agent: Reference
  
  /**
    * The organization the device or practitioner was acting on behalf of.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object ProcedureRequestRequester {
  
  inline def apply(agent: Reference): ProcedureRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequestRequester]
  }
  
  extension [Self <: ProcedureRequestRequester](x: Self) {
    
    inline def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
