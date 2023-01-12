package typings.evaluatex

import org.scalablytyped.runtime.Shortcut
import typings.evaluatex.evaluatexStrings.COMMAND
import typings.evaluatex.evaluatexStrings.DIVIDE
import typings.evaluatex.evaluatexStrings.LPAREN
import typings.evaluatex.evaluatexStrings.NUMBER
import typings.evaluatex.evaluatexStrings.POWER
import typings.evaluatex.evaluatexStrings.RPAREN
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("evaluatex", JSImport.Namespace)
  @js.native
  val ^ : js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Constants], 
    /* options */ js.UndefOr[Options], 
    EvaluatexResult
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.evaluatex.anon.typeFUNCTIONvaluenamekeyo
    - typings.evaluatex.anon.typeSYMBOLPRODUCTSUMINVER
    - typings.evaluatex.anon.typeNUMBERvaluenumberchil
  */
  trait AbstractSyntaxTreeNode extends StObject
  
  type Constant = Double | (js.Function1[/* repeated */ Double, Double])
  
  type Constants = Record[String, Constant]
  
  @js.native
  trait EvaluatexResult extends StObject {
    
    /**
      * @param variables a map of variables that can change between invocations of fn.
      * @returns the numerical result of the calculation.
      */
    def apply(): Double = js.native
    def apply(variables: Variables): Double = js.native
    
    var ast: AbstractSyntaxTreeNode = js.native
    
    var expression: String = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  type IncludeMethods[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (_ : any): any? K : never}[keyof T] */ js.Any
  ]
  
  trait Options extends StObject {
    
    var latex: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLatex(value: Boolean): Self = StObject.set(x, "latex", value.asInstanceOf[js.Any])
      
      inline def setLatexUndefined: Self = StObject.set(x, "latex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.evaluatex.anon.Type
    - typings.evaluatex.anon.Value
    - typings.evaluatex.anon.NameType
  */
  trait Token extends StObject
  object Token {
    
    inline def NameType(name: Null, value: String): typings.evaluatex.anon.NameType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SYMBOL")
      __obj.asInstanceOf[typings.evaluatex.anon.NameType]
    }
    
    inline def Type(`type`: NUMBER | POWER | DIVIDE | LPAREN | RPAREN | COMMAND, value: String | Double): typings.evaluatex.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.evaluatex.anon.Type]
    }
    
    inline def Value(value: js.Array[Any] => Any): typings.evaluatex.anon.Value = {
      val __obj = js.Dynamic.literal(value = js.Any.fromFunction1(value), name = null)
      __obj.updateDynamic("type")("COMMAND")
      __obj.asInstanceOf[typings.evaluatex.anon.Value]
    }
  }
  
  type Variable = Double
  
  type Variables = Record[String, Variable]
  
  type _To = js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Constants], 
    /* options */ js.UndefOr[Options], 
    EvaluatexResult
  ]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Constants], 
    /* options */ js.UndefOr[Options], 
    EvaluatexResult
  ] = ^
}
