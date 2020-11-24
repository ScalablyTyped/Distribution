package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGlobalLexicalScopeNamesResponse extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]] = js.native
  
  var returnType: GlobalLexicalScopeNamesResponse = js.native
}
object ReturnTypeGlobalLexicalScopeNamesResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]],
    returnType: GlobalLexicalScopeNamesResponse
  ): ReturnTypeGlobalLexicalScopeNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGlobalLexicalScopeNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGlobalLexicalScopeNamesResponseOps[Self <: ReturnTypeGlobalLexicalScopeNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GlobalLexicalScopeNamesRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GlobalLexicalScopeNamesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
