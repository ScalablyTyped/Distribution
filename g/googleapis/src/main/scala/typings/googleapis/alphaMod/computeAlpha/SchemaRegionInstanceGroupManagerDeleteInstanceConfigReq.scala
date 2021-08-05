package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RegionInstanceGroupManagers.deletePerInstanceConfigs
  */
trait SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq extends StObject {
  
  /**
    * The list of instances for which we want to delete per-instance configs on
    * this managed instance group.
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of instance names for which we want to delete per-instance
    * configs on this managed instance group.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq {
  
  inline def apply(): SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
