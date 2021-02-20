package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SkipWaitingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `176` extends StObject {
  
  var paramsType: js.Array[SkipWaitingRequest] = js.native
  
  var returnType: Unit = js.native
}
object `176` {
  
  @scala.inline
  def apply(paramsType: js.Array[SkipWaitingRequest], returnType: Unit): `176` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit class `176MutableBuilder`[Self <: `176`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SkipWaitingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SkipWaitingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
