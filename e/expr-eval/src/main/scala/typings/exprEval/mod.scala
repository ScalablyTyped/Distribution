package typings.exprEval

import org.scalablytyped.runtime.StringDictionary
import typings.exprEval.anon.Abs
import typings.exprEval.anon.WithMembers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expr-eval", "Parser")
  @js.native
  open class Parser () extends StObject {
    def this(options: ParserOptions) = this()
    
    var consts: Any = js.native
    
    def evaluate(expression: String): Double = js.native
    def evaluate(expression: String, values: Value): Double = js.native
    
    var functions: Any = js.native
    
    def parse(expression: String): Expression = js.native
    
    var unaryOps: Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("expr-eval", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def evaluate(expression: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def evaluate(expression: String, values: Value): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def parse(expression: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(expression.asInstanceOf[js.Any]).asInstanceOf[Expression]
  }
  
  @js.native
  trait Expression extends StObject {
    
    def evaluate(): Any = js.native
    def evaluate(values: Value): Any = js.native
    
    def simplify(): Expression = js.native
    def simplify(values: Value): Expression = js.native
    
    def substitute(variable: String, value: String): Expression = js.native
    def substitute(variable: String, value: Double): Expression = js.native
    def substitute(variable: String, value: Expression): Expression = js.native
    
    def symbols(): js.Array[String] = js.native
    def symbols(options: WithMembers): js.Array[String] = js.native
    
    def toJSFunction(params: String): js.Function1[/* repeated */ Any, Double] = js.native
    def toJSFunction(params: String, values: Value): js.Function1[/* repeated */ Any, Double] = js.native
    
    def variables(): js.Array[String] = js.native
    def variables(options: WithMembers): js.Array[String] = js.native
  }
  
  trait ParserOptions extends StObject {
    
    var allowMemberAccess: js.UndefOr[Boolean] = js.undefined
    
    var operators: js.UndefOr[Abs] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setAllowMemberAccess(value: Boolean): Self = StObject.set(x, "allowMemberAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowMemberAccessUndefined: Self = StObject.set(x, "allowMemberAccess", js.undefined)
      
      inline def setOperators(value: Abs): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
      
      inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    }
  }
  
  type Value = Double | String | (js.Function1[/* repeated */ Any, Any]) | StringDictionary[Any]
  
  trait Values
    extends StObject
       with /* propertyName */ StringDictionary[Value]
  object Values {
    
    inline def apply(): Values = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Values]
    }
  }
}
