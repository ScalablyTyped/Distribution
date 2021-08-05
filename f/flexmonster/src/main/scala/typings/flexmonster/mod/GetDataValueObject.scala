package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataValueObject extends StObject {
  
  var data: js.Array[js.Object]
  
  var meta: js.Object
}
object GetDataValueObject {
  
  inline def apply(data: js.Array[js.Object], meta: js.Object): GetDataValueObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataValueObject]
  }
  
  extension [Self <: GetDataValueObject](x: Self) {
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
