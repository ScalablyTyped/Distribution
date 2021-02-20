package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.ClearRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `70` extends StObject {
  
  var paramsType: js.Array[ClearRequest] = js.native
  
  var returnType: Unit = js.native
}
object `70` {
  
  @scala.inline
  def apply(paramsType: js.Array[ClearRequest], returnType: Unit): `70` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit class `70MutableBuilder`[Self <: `70`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ClearRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ClearRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
