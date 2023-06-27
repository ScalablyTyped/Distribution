package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHingeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetShowHingeRequest]]
  
  var returnType: Unit
}
object `164` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[SetShowHingeRequest]], returnType: Unit): `164` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `164`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[SetShowHingeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[SetShowHingeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
