package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who is asking for task to be done
  */
@js.native
trait TaskRequester extends BackboneElement {
  
  /**
    * Individual asking for task
    */
  var agent: Reference = js.native
  
  /**
    * Organization individual is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
}
object TaskRequester {
  
  @scala.inline
  def apply(agent: Reference): TaskRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRequester]
  }
  
  @scala.inline
  implicit class TaskRequesterMutableBuilder[Self <: TaskRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Reference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
