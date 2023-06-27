package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.EmulateTouchFromMouseEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var paramsType: js.Array[EmulateTouchFromMouseEventRequest]
  
  var returnType: Unit
}
object `118` {
  
  inline def apply(paramsType: js.Array[EmulateTouchFromMouseEventRequest], returnType: Unit): `118` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `118`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[EmulateTouchFromMouseEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EmulateTouchFromMouseEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
