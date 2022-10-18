package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCgroupCpu extends StObject {
  
  var cfs_period_micros: js.UndefOr[integer] = js.undefined
  
  var cfs_quota_micros: js.UndefOr[integer] = js.undefined
  
  var control_group: js.UndefOr[String] = js.undefined
  
  var stat: js.UndefOr[NodesCgroupCpuStat] = js.undefined
}
object NodesCgroupCpu {
  
  inline def apply(): NodesCgroupCpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCgroupCpu]
  }
  
  extension [Self <: NodesCgroupCpu](x: Self) {
    
    inline def setCfs_period_micros(value: integer): Self = StObject.set(x, "cfs_period_micros", value.asInstanceOf[js.Any])
    
    inline def setCfs_period_microsUndefined: Self = StObject.set(x, "cfs_period_micros", js.undefined)
    
    inline def setCfs_quota_micros(value: integer): Self = StObject.set(x, "cfs_quota_micros", value.asInstanceOf[js.Any])
    
    inline def setCfs_quota_microsUndefined: Self = StObject.set(x, "cfs_quota_micros", js.undefined)
    
    inline def setControl_group(value: String): Self = StObject.set(x, "control_group", value.asInstanceOf[js.Any])
    
    inline def setControl_groupUndefined: Self = StObject.set(x, "control_group", js.undefined)
    
    inline def setStat(value: NodesCgroupCpuStat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    
    inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
  }
}
