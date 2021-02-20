package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EnableResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsTypeReturnType extends StObject {
  
  var paramsType: js.Array[js.UndefOr[EnableRequest]] = js.native
  
  var returnType: EnableResponse = js.native
}
object ParamsTypeReturnType {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[EnableRequest]], returnType: EnableResponse): ParamsTypeReturnType = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnType]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeMutableBuilder[Self <: ParamsTypeReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[EnableRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[EnableRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: EnableResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
