package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.EmulateTouchFromMouseEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var paramsType: js.Array[EmulateTouchFromMouseEventRequest]
  
  var returnType: Unit
}
object `101` {
  
  inline def apply(paramsType: js.Array[EmulateTouchFromMouseEventRequest], returnType: Unit): `101` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setParamsType(value: js.Array[EmulateTouchFromMouseEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EmulateTouchFromMouseEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
