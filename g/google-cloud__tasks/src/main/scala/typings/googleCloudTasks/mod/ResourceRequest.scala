package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequest extends StObject {
  
  /**
    * The resource for which the policy is being requested. resource is usually specified as a path. For example, a Project resource is specified as projects/{project}.
    */
  var resource: String
}
object ResourceRequest {
  
  inline def apply(resource: String): ResourceRequest = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequest]
  }
  
  extension [Self <: ResourceRequest](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
