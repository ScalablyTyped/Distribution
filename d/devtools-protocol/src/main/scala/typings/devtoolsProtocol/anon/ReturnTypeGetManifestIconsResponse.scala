package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetManifestIconsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetManifestIconsResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetManifestIconsResponse = js.native
}
object ReturnTypeGetManifestIconsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetManifestIconsResponse): ReturnTypeGetManifestIconsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetManifestIconsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetManifestIconsResponseMutableBuilder[Self <: ReturnTypeGetManifestIconsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetManifestIconsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
