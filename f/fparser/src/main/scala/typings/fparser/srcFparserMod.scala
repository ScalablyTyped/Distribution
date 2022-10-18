package typings.fparser

import typings.fparser.anon.Memoization
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFparserMod {
  
  @JSImport("fparser/src/fparser", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formula {
    def this(fStr: String) = this()
    def this(fStr: String, options: Memoization) = this()
  }
  /* static members */
  object default {
    
    @JSImport("fparser/src/fparser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def calc(formula: String, valueObj: js.Array[js.Object]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Array[js.Object], options: Memoization): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Object, options: Memoization): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @js.native
  trait Formula extends StObject {
    
    def _do_parse(str: String): Any = js.native
    
    def buildExpressionTree(expressions: js.Array[Any]): Any = js.native
    
    def cleanupInputString(s: String): String = js.native
    
    def disableMemoization(): Unit = js.native
    
    def enableMemoization(): Unit = js.native
    
    def evaluate(valueObj: js.Array[js.Object]): Any = js.native
    def evaluate(valueObj: js.Object): Any = js.native
    
    def getExpression(): js.Array[Any] = js.native
    
    def getExpressionString(): String = js.native
    
    def getVariables(): js.Array[String] = js.native
    
    def hashValues(valueObj: js.Object): String = js.native
    
    def isOperator(char: Any): RegExpMatchArray | Null = js.native
    
    def isOperatorExpr(expr: Any): Boolean = js.native
    
    def parse(str: String): Any = js.native
    
    def registerVariable(varName: String): Unit = js.native
    
    def resultFromMemory(valueObj: js.Object): Any = js.native
    
    def setFormula(formulaString: String): this.type = js.native
    
    def splitFunctionParams(toSplit: String): js.Array[String] = js.native
    
    def storeInMemory(valueObj: js.Object, value: Any): Unit = js.native
  }
}
