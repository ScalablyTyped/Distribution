package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecovery
  extends StObject
     with Generic {
  
  var active_only: js.UndefOr[Boolean] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IndicesRecovery {
  
  inline def apply(): IndicesRecovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRecovery]
  }
  
  extension [Self <: IndicesRecovery](x: Self) {
    
    inline def setActive_only(value: Boolean): Self = StObject.set(x, "active_only", value.asInstanceOf[js.Any])
    
    inline def setActive_onlyUndefined: Self = StObject.set(x, "active_only", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
