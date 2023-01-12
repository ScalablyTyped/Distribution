package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsFieldTypesMappings extends StObject {
  
  var field_types: js.Array[ClusterStatsFieldTypes]
  
  var runtime_field_types: js.UndefOr[js.Array[ClusterStatsRuntimeFieldTypes]] = js.undefined
}
object ClusterStatsFieldTypesMappings {
  
  inline def apply(field_types: js.Array[ClusterStatsFieldTypes]): ClusterStatsFieldTypesMappings = {
    val __obj = js.Dynamic.literal(field_types = field_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsFieldTypesMappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsFieldTypesMappings] (val x: Self) extends AnyVal {
    
    inline def setField_types(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
    
    inline def setField_typesVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "field_types", js.Array(value*))
    
    inline def setRuntime_field_types(value: js.Array[ClusterStatsRuntimeFieldTypes]): Self = StObject.set(x, "runtime_field_types", value.asInstanceOf[js.Any])
    
    inline def setRuntime_field_typesUndefined: Self = StObject.set(x, "runtime_field_types", js.undefined)
    
    inline def setRuntime_field_typesVarargs(value: ClusterStatsRuntimeFieldTypes*): Self = StObject.set(x, "runtime_field_types", js.Array(value*))
  }
}
