package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetLocalFontsEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var paramsType: js.Array[SetLocalFontsEnabledRequest]
  
  var returnType: Unit
}
object `48` {
  
  inline def apply(paramsType: js.Array[SetLocalFontsEnabledRequest], returnType: Unit): `48` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetLocalFontsEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetLocalFontsEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
