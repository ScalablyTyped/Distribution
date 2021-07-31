package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RegionInstanceGroupManagers.updatePerInstanceConfigs
  */
trait SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq extends StObject {
  
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.undefined
}
object SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagerUpdateInstanceConfigReqMutableBuilder[Self <: SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerInstanceConfigs(value: js.Array[SchemaPerInstanceConfig]): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
    
    @scala.inline
    def setPerInstanceConfigsVarargs(value: SchemaPerInstanceConfig*): Self = StObject.set(x, "perInstanceConfigs", js.Array(value :_*))
  }
}
