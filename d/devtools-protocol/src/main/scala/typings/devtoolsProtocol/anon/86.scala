package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetAutoDarkModeOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetAutoDarkModeOverrideRequest]]
  
  var returnType: Unit
}
object `86` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[SetAutoDarkModeOverrideRequest]], returnType: Unit): `86` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`86`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `86`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[SetAutoDarkModeOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[SetAutoDarkModeOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
