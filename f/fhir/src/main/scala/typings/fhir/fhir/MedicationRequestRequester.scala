package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who/What requested the Request
  */
trait MedicationRequestRequester
  extends StObject
     with BackboneElement {
  
  /**
    * Who ordered the initial medication(s)
    */
  var agent: Reference
  
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object MedicationRequestRequester {
  
  @scala.inline
  def apply(agent: Reference): MedicationRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequestRequester]
  }
  
  @scala.inline
  implicit class MedicationRequestRequesterMutableBuilder[Self <: MedicationRequestRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
