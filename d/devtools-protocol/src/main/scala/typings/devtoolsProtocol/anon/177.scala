package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetFontFamiliesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  var paramsType: js.Array[SetFontFamiliesRequest]
  
  var returnType: Unit
}
object `177` {
  
  inline def apply(paramsType: js.Array[SetFontFamiliesRequest], returnType: Unit): `177` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `177`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetFontFamiliesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetFontFamiliesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
