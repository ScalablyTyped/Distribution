package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who/what is requesting procedure or diagnostic
  */
trait ProcedureRequestRequester
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
object ProcedureRequestRequester {
  
  @scala.inline
  def apply(agent: Reference): ProcedureRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequestRequester]
  }
  
  @scala.inline
  implicit class ProcedureRequestRequesterMutableBuilder[Self <: ProcedureRequestRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
