package typings.estree.mod

import org.scalablytyped.runtime.StObject
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
  implicit class BaseFunctionMutableBuilder[Self <: BaseFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBody(value: BlockStatement | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[Pattern]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Pattern*): Self = StObject.set(x, "params", js.Array(value :_*))
  }
}
