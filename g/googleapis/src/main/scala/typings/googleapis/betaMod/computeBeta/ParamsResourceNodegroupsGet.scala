package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodegroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the node group to return.
    */
  var nodeGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceNodegroupsGet {
  
  inline def apply(): ParamsResourceNodegroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodegroupsGet]
  }
  
  extension [Self <: ParamsResourceNodegroupsGet](x: Self) {
    
    inline def setNodeGroup(value: String): Self = StObject.set(x, "nodeGroup", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUndefined: Self = StObject.set(x, "nodeGroup", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
