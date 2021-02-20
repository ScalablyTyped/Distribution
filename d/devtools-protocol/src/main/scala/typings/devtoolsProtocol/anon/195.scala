package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.SetAutoAttachRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `195` extends StObject {
  
  var paramsType: js.Array[SetAutoAttachRequest] = js.native
  
  var returnType: Unit = js.native
}
object `195` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetAutoAttachRequest], returnType: Unit): `195` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`195`]
  }
  
  @scala.inline
  implicit class `195MutableBuilder`[Self <: `195`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetAutoAttachRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetAutoAttachRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
