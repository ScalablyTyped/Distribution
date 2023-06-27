package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetDefaultBackgroundColorOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]
  
  var returnType: Unit
}
object `88` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]], returnType: Unit): `88` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`88`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `88`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[SetDefaultBackgroundColorOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
