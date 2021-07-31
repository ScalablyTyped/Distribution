package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * A filter for the state of the instances in the instance group. Valid
    * options are ALL or RUNNING. If you do not specify this parameter the list
    * includes all instances regardless of their state.
    */
  var instanceState: js.UndefOr[String] = js.undefined
}
object SchemaInstanceGroupsListInstancesRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsListInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupsListInstancesRequestMutableBuilder[Self <: SchemaInstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
  }
}
