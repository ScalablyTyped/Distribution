package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentRequest extends StObject {
  
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String
}
object ParentRequest {
  
  @scala.inline
  def apply(parent: String): ParentRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentRequest]
  }
  
  @scala.inline
  implicit class ParentRequestMutableBuilder[Self <: ParentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
