package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetAttributeValueRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var paramsType: js.Array[SetAttributeValueRequest]
  
  var returnType: Unit
}
object `63` {
  
  inline def apply(paramsType: js.Array[SetAttributeValueRequest], returnType: Unit): `63` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `63`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetAttributeValueRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAttributeValueRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
