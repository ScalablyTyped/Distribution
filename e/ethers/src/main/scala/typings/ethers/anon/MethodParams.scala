package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodParams extends StObject {
  
  var method: String
  
  var params: js.Array[Any]
}
object MethodParams {
  
  inline def apply(method: String, params: js.Array[Any]): MethodParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodParams] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
