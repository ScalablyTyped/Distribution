package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.BackgroundService.SetRecordingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var paramsType: js.Array[SetRecordingRequest]
  
  var returnType: Unit
}
object `34` {
  
  inline def apply(paramsType: js.Array[SetRecordingRequest], returnType: Unit): `34` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `34`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetRecordingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetRecordingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
