package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.ClearCredentialsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `210` extends StObject {
  
  var paramsType: js.Array[ClearCredentialsRequest] = js.native
  
  var returnType: Unit = js.native
}
object `210` {
  
  @scala.inline
  def apply(paramsType: js.Array[ClearCredentialsRequest], returnType: Unit): `210` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit class `210MutableBuilder`[Self <: `210`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ClearCredentialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ClearCredentialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
