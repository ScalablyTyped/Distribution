package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancegroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the instance group.
    */
  var instanceGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone where the instance group is located.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancegroupsGet {
  
  inline def apply(): ParamsResourceInstancegroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupsGet]
  }
  
  extension [Self <: ParamsResourceInstancegroupsGet](x: Self) {
    
    inline def setInstanceGroup(value: String): Self = StObject.set(x, "instanceGroup", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupUndefined: Self = StObject.set(x, "instanceGroup", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
