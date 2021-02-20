package typings.exprEval

import org.scalablytyped.runtime.StringDictionary
import typings.exprEval.anon.Abs
import typings.exprEval.anon.WithMembers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expr-eval", "Parser")
  @js.native
  class Parser () extends StObject {
    def this(options: ParserOptions) = this()
    
    var consts: js.Any = js.native
    
    def evaluate(expression: String): Double = js.native
    def evaluate(expression: String, values: Value): Double = js.native
    
    var functions: js.Any = js.native
    
    def parse(expression: String): Expression = js.native
    
    var unaryOps: js.Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("expr-eval", "Parser.evaluate")
    @js.native
    def evaluate(expression: String): Double = js.native
    @JSImport("expr-eval", "Parser.evaluate")
    @js.native
    def evaluate(expression: String, values: Value): Double = js.native
    
    @JSImport("expr-eval", "Parser.parse")
    @js.native
    def parse(expression: String): Expression = js.native
  }
  
  @js.native
  trait Expression extends StObject {
    
    def evaluate(): js.Any = js.native
    def evaluate(values: Value): js.Any = js.native
    
    def simplify(): Expression = js.native
    def simplify(values: Value): Expression = js.native
    
    def substitute(variable: String, value: String): Expression = js.native
    def substitute(variable: String, value: Double): Expression = js.native
    def substitute(variable: String, value: Expression): Expression = js.native
    
    def symbols(): js.Array[String] = js.native
    def symbols(options: WithMembers): js.Array[String] = js.native
    
    def toJSFunction(params: String): js.Function1[/* repeated */ js.Any, Double] = js.native
    def toJSFunction(params: String, values: Value): js.Function1[/* repeated */ js.Any, Double] = js.native
    
    def variables(): js.Array[String] = js.native
    def variables(options: WithMembers): js.Array[String] = js.native
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var allowMemberAccess: js.UndefOr[Boolean] = js.native
    
    var operators: js.UndefOr[Abs] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMemberAccess(value: Boolean): Self = StObject.set(x, "allowMemberAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMemberAccessUndefined: Self = StObject.set(x, "allowMemberAccess", js.undefined)
      
      @scala.inline
      def setOperators(value: Abs): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    }
  }
  
  type Value = Double | String | (js.Function1[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* repeated */ js.Object, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ]) | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ])
  
  type Values = StringDictionary[Value]
}
