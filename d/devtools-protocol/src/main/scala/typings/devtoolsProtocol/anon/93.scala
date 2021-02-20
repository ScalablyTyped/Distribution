package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.CloseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `93` extends StObject {
  
  var paramsType: js.Array[CloseRequest] = js.native
  
  var returnType: Unit = js.native
}
object `93` {
  
  @scala.inline
  def apply(paramsType: js.Array[CloseRequest], returnType: Unit): `93` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CloseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CloseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
