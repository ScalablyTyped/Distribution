package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCpuAcct extends StObject {
  
  var control_group: js.UndefOr[String] = js.undefined
  
  var usage_nanos: js.UndefOr[DurationValue[UnitNanos]] = js.undefined
}
object NodesCpuAcct {
  
  inline def apply(): NodesCpuAcct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCpuAcct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesCpuAcct] (val x: Self) extends AnyVal {
    
    inline def setControl_group(value: String): Self = StObject.set(x, "control_group", value.asInstanceOf[js.Any])
    
    inline def setControl_groupUndefined: Self = StObject.set(x, "control_group", js.undefined)
    
    inline def setUsage_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "usage_nanos", value.asInstanceOf[js.Any])
    
    inline def setUsage_nanosUndefined: Self = StObject.set(x, "usage_nanos", js.undefined)
  }
}
