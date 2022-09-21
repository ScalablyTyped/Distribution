package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesExistsTypeParams
  extends StObject
     with IndicesExistsParams {
  
  var `type`: NameList
}
object IndicesExistsTypeParams {
  
  inline def apply(index: NameList, `type`: NameList): IndicesExistsTypeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsTypeParams]
  }
  
  extension [Self <: IndicesExistsTypeParams](x: Self) {
    
    inline def setType(value: NameList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
