package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizePinchGestureRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `103` extends StObject {
  
  var paramsType: js.Array[SynthesizePinchGestureRequest] = js.native
  
  var returnType: Unit = js.native
}
object `103` {
  
  @scala.inline
  def apply(paramsType: js.Array[SynthesizePinchGestureRequest], returnType: Unit): `103` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103MutableBuilder`[Self <: `103`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SynthesizePinchGestureRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SynthesizePinchGestureRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
