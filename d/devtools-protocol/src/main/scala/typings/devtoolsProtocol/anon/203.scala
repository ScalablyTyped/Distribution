package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.FailRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `203` extends StObject {
  
  var paramsType: js.Array[FailRequestRequest] = js.native
  
  var returnType: Unit = js.native
}
object `203` {
  
  @scala.inline
  def apply(paramsType: js.Array[FailRequestRequest], returnType: Unit): `203` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit class `203MutableBuilder`[Self <: `203`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[FailRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: FailRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
