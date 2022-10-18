package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsFieldTypes extends StObject {
  
  var count: integer
  
  var index_count: integer
  
  var name: Name
  
  var script_count: js.UndefOr[integer] = js.undefined
}
object ClusterStatsFieldTypes {
  
  inline def apply(count: integer, index_count: integer, name: Name): ClusterStatsFieldTypes = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], index_count = index_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsFieldTypes]
  }
  
  extension [Self <: ClusterStatsFieldTypes](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIndex_count(value: integer): Self = StObject.set(x, "index_count", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScript_count(value: integer): Self = StObject.set(x, "script_count", value.asInstanceOf[js.Any])
    
    inline def setScript_countUndefined: Self = StObject.set(x, "script_count", js.undefined)
  }
}
