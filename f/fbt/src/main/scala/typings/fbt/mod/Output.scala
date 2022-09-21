package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  var fbt: js.Array[String]
  
  var params: String
}
object Output {
  
  inline def apply(fbt: js.Array[String], params: String): Output = {
    val __obj = js.Dynamic.literal(fbt = fbt.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  extension [Self <: Output](x: Self) {
    
    inline def setFbt(value: js.Array[String]): Self = StObject.set(x, "fbt", value.asInstanceOf[js.Any])
    
    inline def setFbtVarargs(value: String*): Self = StObject.set(x, "fbt", js.Array(value*))
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
