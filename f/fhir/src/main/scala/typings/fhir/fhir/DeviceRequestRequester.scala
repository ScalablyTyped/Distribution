package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who/what is requesting diagnostics
  */
@js.native
trait DeviceRequestRequester extends BackboneElement {
  
  /**
    * Individual making the request
    */
  var agent: Reference = js.native
  
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
}
object DeviceRequestRequester {
  
  @scala.inline
  def apply(agent: Reference): DeviceRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRequestRequester]
  }
  
  @scala.inline
  implicit class DeviceRequestRequesterMutableBuilder[Self <: DeviceRequestRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
