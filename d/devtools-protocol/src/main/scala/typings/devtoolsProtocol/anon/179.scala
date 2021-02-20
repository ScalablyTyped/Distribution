package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.UnregisterRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `179` extends StObject {
  
  var paramsType: js.Array[UnregisterRequest] = js.native
  
  var returnType: Unit = js.native
}
object `179` {
  
  @scala.inline
  def apply(paramsType: js.Array[UnregisterRequest], returnType: Unit): `179` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit class `179MutableBuilder`[Self <: `179`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[UnregisterRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: UnregisterRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
