package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueWithAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `206` extends StObject {
  
  var paramsType: js.Array[ContinueWithAuthRequest] = js.native
  
  var returnType: Unit = js.native
}
object `206` {
  
  @scala.inline
  def apply(paramsType: js.Array[ContinueWithAuthRequest], returnType: Unit): `206` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit class `206MutableBuilder`[Self <: `206`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ContinueWithAuthRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ContinueWithAuthRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
