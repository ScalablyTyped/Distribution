package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupRollupRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var config: js.UndefOr[Any] = js.undefined
  
  var index: IndexName
  
  var rollup_index: IndexName
}
object RollupRollupRequest {
  
  inline def apply(index: IndexName, rollup_index: IndexName): RollupRollupRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rollup_index = rollup_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupRollupRequest]
  }
  
  extension [Self <: RollupRollupRequest](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRollup_index(value: IndexName): Self = StObject.set(x, "rollup_index", value.asInstanceOf[js.Any])
  }
}
