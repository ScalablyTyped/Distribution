package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who/what is requesting diagnostics
  */
trait DeviceRequestRequester
  extends StObject
     with BackboneElement {
  
  /**
    * Individual making the request
    */
  var agent: Reference
  
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object DeviceRequestRequester {
  
  inline def apply(agent: Reference): DeviceRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRequestRequester]
  }
  
  extension [Self <: DeviceRequestRequester](x: Self) {
    
    inline def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
