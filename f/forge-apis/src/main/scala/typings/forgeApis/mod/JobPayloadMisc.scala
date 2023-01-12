package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPayloadMisc extends StObject {
  
  var workflow: js.UndefOr[String] = js.undefined
  
  var workflowAttributes: js.UndefOr[js.Object] = js.undefined
}
object JobPayloadMisc {
  
  inline def apply(): JobPayloadMisc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobPayloadMisc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobPayloadMisc] (val x: Self) extends AnyVal {
    
    inline def setWorkflow(value: String): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowAttributes(value: js.Object): Self = StObject.set(x, "workflowAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowAttributesUndefined: Self = StObject.set(x, "workflowAttributes", js.undefined)
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
  }
}
