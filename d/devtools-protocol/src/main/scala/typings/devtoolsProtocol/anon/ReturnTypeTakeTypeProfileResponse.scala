package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.TakeTypeProfileResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeTakeTypeProfileResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: TakeTypeProfileResponse = js.native
}
object ReturnTypeTakeTypeProfileResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: TakeTypeProfileResponse): ReturnTypeTakeTypeProfileResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeTypeProfileResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeTakeTypeProfileResponseMutableBuilder[Self <: ReturnTypeTakeTypeProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: TakeTypeProfileResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
