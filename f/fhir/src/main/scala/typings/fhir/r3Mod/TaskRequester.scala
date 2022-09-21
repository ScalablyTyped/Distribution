package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRequester
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who initiated the task.
    */
  var agent: Reference
  
  /**
    * The organization the device or practitioner was acting on behalf of when they initiated the task.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object TaskRequester {
  
  inline def apply(agent: Reference): TaskRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRequester]
  }
  
  extension [Self <: TaskRequester](x: Self) {
    
    inline def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
