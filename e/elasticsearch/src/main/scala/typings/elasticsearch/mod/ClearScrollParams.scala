package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearScrollParams
  extends StObject
     with GenericParams {
  
  var scrollId: NameList
}
object ClearScrollParams {
  
  inline def apply(scrollId: NameList): ClearScrollParams = {
    val __obj = js.Dynamic.literal(scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearScrollParams]
  }
  
  extension [Self <: ClearScrollParams](x: Self) {
    
    inline def setScrollId(value: NameList): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
    
    inline def setScrollIdVarargs(value: String*): Self = StObject.set(x, "scrollId", js.Array(value*))
  }
}
