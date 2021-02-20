package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `182` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetCookiesRequest]] = js.native
  
  var returnType: GetCookiesResponse = js.native
}
object `182` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetCookiesRequest]], returnType: GetCookiesResponse): `182` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit class `182MutableBuilder`[Self <: `182`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetCookiesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetCookiesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
