package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * Instances in which state should be returned. Valid options are:
    * &#39;ALL&#39;, &#39;RUNNING&#39;. By default, it lists all instances.
    */
  var instanceState: js.UndefOr[String] = js.undefined
  
  /**
    * Name of port user is interested in. It is optional. If it is set, only
    * information about this ports will be returned. If it is not set, all the
    * named ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[String] = js.undefined
}
object SchemaRegionInstanceGroupsListInstancesRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupsListInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupsListInstancesRequestMutableBuilder[Self <: SchemaRegionInstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
  }
}
