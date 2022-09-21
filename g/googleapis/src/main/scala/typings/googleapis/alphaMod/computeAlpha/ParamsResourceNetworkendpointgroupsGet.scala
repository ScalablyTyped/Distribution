package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworkendpointgroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the network endpoint group. It should comply with RFC1035.
    */
  var networkEndpointGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworkendpointgroupsGet {
  
  inline def apply(): ParamsResourceNetworkendpointgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkendpointgroupsGet]
  }
  
  extension [Self <: ParamsResourceNetworkendpointgroupsGet](x: Self) {
    
    inline def setNetworkEndpointGroup(value: String): Self = StObject.set(x, "networkEndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointGroupUndefined: Self = StObject.set(x, "networkEndpointGroup", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
