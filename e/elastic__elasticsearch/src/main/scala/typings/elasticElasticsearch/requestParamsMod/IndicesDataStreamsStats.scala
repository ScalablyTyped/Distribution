package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamsStats
  extends StObject
     with Generic {
  
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IndicesDataStreamsStats {
  
  inline def apply(): IndicesDataStreamsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesDataStreamsStats]
  }
  
  extension [Self <: IndicesDataStreamsStats](x: Self) {
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
