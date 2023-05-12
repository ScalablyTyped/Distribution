package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameAckRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  var paramsType: js.Array[ScreencastFrameAckRequest]
  
  var returnType: Unit
}
object `170` {
  
  inline def apply(paramsType: js.Array[ScreencastFrameAckRequest], returnType: Unit): `170` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `170`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ScreencastFrameAckRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ScreencastFrameAckRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
