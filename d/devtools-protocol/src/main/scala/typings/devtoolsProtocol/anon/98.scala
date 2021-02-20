package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.InsertTextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `98` extends StObject {
  
  var paramsType: js.Array[InsertTextRequest] = js.native
  
  var returnType: Unit = js.native
}
object `98` {
  
  @scala.inline
  def apply(paramsType: js.Array[InsertTextRequest], returnType: Unit): `98` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit class `98MutableBuilder`[Self <: `98`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[InsertTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: InsertTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
