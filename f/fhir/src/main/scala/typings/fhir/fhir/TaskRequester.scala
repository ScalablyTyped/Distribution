package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who is asking for task to be done
  */
trait TaskRequester
  extends StObject
     with BackboneElement {
  
  /**
    * Individual asking for task
    */
  var agent: Reference
  
  /**
    * Organization individual is acting for
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
