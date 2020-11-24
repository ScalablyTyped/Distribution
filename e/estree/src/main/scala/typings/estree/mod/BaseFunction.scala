package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFunction extends BaseNode {
  
  var async: js.UndefOr[Boolean] = js.native
  
  // The body is either BlockStatement or Expression because arrow functions
  // can have a body that's either. FunctionDeclarations and
  // FunctionExpressions have only BlockStatement bodies.
  var body: BlockStatement | Expression = js.native
  
  var generator: js.UndefOr[Boolean] = js.native
  
  var params: js.Array[Pattern] = js.native
}
object BaseFunction {
  
  @scala.inline
  def apply(body: BlockStatement | Expression, params: js.Array[Pattern], `type`: String): BaseFunction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFunction]
  }
  
  @scala.inline
  implicit class BaseFunctionOps[Self <: BaseFunction] (val x: Self) extends AnyVal {
    
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
    def setBody(value: BlockStatement | Expression): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Pattern*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Pattern]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
  }
}
