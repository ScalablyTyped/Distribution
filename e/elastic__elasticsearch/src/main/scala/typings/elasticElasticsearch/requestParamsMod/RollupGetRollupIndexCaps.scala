package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupIndexCaps
  extends StObject
     with Generic {
  
  var index: String
}
object RollupGetRollupIndexCaps {
  
  inline def apply(index: String): RollupGetRollupIndexCaps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCaps]
  }
  
  extension [Self <: RollupGetRollupIndexCaps](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
