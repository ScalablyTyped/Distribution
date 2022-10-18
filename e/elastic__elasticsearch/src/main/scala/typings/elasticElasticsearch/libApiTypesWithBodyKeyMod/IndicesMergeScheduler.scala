package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMergeScheduler extends StObject {
  
  var max_merge_count: js.UndefOr[integer] = js.undefined
  
  var max_thread_count: js.UndefOr[integer] = js.undefined
}
object IndicesMergeScheduler {
  
  inline def apply(): IndicesMergeScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMergeScheduler]
  }
  
  extension [Self <: IndicesMergeScheduler](x: Self) {
    
    inline def setMax_merge_count(value: integer): Self = StObject.set(x, "max_merge_count", value.asInstanceOf[js.Any])
    
    inline def setMax_merge_countUndefined: Self = StObject.set(x, "max_merge_count", js.undefined)
    
    inline def setMax_thread_count(value: integer): Self = StObject.set(x, "max_thread_count", value.asInstanceOf[js.Any])
    
    inline def setMax_thread_countUndefined: Self = StObject.set(x, "max_thread_count", js.undefined)
  }
}
