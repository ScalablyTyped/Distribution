package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.ResetPermissionsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ResetPermissionsRequest]]
  
  var returnType: Unit
}
object `38` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[ResetPermissionsRequest]], returnType: Unit): `38` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `38`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[ResetPermissionsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[ResetPermissionsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
