package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.FulfillRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `204` extends StObject {
  
  var paramsType: js.Array[FulfillRequestRequest] = js.native
  
  var returnType: Unit = js.native
}
object `204` {
  
  @scala.inline
  def apply(paramsType: js.Array[FulfillRequestRequest], returnType: Unit): `204` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit class `204MutableBuilder`[Self <: `204`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[FulfillRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: FulfillRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
