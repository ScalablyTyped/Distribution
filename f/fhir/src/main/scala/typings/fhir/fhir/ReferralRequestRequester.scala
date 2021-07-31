package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who/what is requesting service
  */
trait ReferralRequestRequester
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
object ReferralRequestRequester {
  
  @scala.inline
  def apply(agent: Reference): ReferralRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferralRequestRequester]
  }
  
  @scala.inline
  implicit class ReferralRequestRequesterMutableBuilder[Self <: ReferralRequestRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
