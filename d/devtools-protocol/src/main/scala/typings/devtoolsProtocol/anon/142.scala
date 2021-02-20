package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.DeleteCookieRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `142` extends StObject {
  
  var paramsType: js.Array[DeleteCookieRequest] = js.native
  
  var returnType: Unit = js.native
}
object `142` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeleteCookieRequest], returnType: Unit): `142` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit class `142MutableBuilder`[Self <: `142`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeleteCookieRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeleteCookieRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
