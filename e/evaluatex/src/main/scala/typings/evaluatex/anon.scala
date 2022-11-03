package typings.evaluatex

import typings.evaluatex.evaluatexStrings.COMMAND
import typings.evaluatex.evaluatexStrings.DIVIDE
import typings.evaluatex.evaluatexStrings.FUNCTION
import typings.evaluatex.evaluatexStrings.INVERSE
import typings.evaluatex.evaluatexStrings.LPAREN
import typings.evaluatex.evaluatexStrings.NEGATE
import typings.evaluatex.evaluatexStrings.NUMBER
import typings.evaluatex.evaluatexStrings.POWER
import typings.evaluatex.evaluatexStrings.PRODUCT
import typings.evaluatex.evaluatexStrings.RPAREN
import typings.evaluatex.evaluatexStrings.SUM
import typings.evaluatex.evaluatexStrings.SYMBOL
import typings.evaluatex.mod.AbstractSyntaxTreeNode
import typings.evaluatex.mod.Token
import typings.evaluatex.mod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: js.UndefOr[/* keyof evaluatex.evaluatex.IncludeMethods<std.Math> */ String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: /* keyof evaluatex.evaluatex.IncludeMethods<std.Math> */ String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait NameType
    extends StObject
       with Token {
    
    var name: Null
    
    var `type`: SYMBOL
    
    var value: String
  }
  object NameType {
    
    inline def apply(name: Null, value: String): NameType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SYMBOL")
      __obj.asInstanceOf[NameType]
    }
    
    extension [Self <: NameType](x: Self) {
      
      inline def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: SYMBOL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with Token {
    
    var name: String | Null
    
    var `type`: NUMBER | POWER | DIVIDE | LPAREN | RPAREN | COMMAND
    
    var value: String | Double
  }
  object Type {
    
    inline def apply(`type`: NUMBER | POWER | DIVIDE | LPAREN | RPAREN | COMMAND, value: String | Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setType(value: NUMBER | POWER | DIVIDE | LPAREN | RPAREN | COMMAND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value
    extends StObject
       with Token {
    
    var name: String | Null
    
    var `type`: COMMAND
    
    def value(params: js.Array[Any]): Any
  }
  object Value {
    
    inline def apply(value: js.Array[Any] => Any): Value = {
      val __obj = js.Dynamic.literal(value = js.Any.fromFunction1(value), name = null)
      __obj.updateDynamic("type")("COMMAND")
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setType(value: COMMAND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Any] => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {  type :'FUNCTION',   value :{  name :keyof evaluatex.evaluatex.IncludeMethods<std.Math> | undefined} & (args : ...unknown): number,   name :string | null} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (variables : evaluatex.evaluatex.Variables | undefined): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  @js.native
  trait typeFUNCTIONvaluenamekeyo
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode] = js.native
    
    def evaluate(): Double = js.native
    def evaluate(variables: Variables): Double = js.native
    
    var name: (String | Null) & (Null | String) = js.native
    
    def simplify(): AbstractSyntaxTreeNode = js.native
    
    var `type`: FUNCTION = js.native
    
    def value(args: Any*): Double = js.native
    @JSName("value")
    var value_Original: Name & (js.Function1[/* repeated */ Any, Double]) = js.native
  }
  
  /* Inlined {  type :'NUMBER',   value :number} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (variables : evaluatex.evaluatex.Variables | undefined): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  @js.native
  trait typeNUMBERvaluenumberchil
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode] = js.native
    
    def evaluate(): Double = js.native
    def evaluate(variables: Variables): Double = js.native
    
    var name: Null | String = js.native
    
    def simplify(): AbstractSyntaxTreeNode = js.native
    
    var `type`: NUMBER = js.native
    
    var value: Double = js.native
  }
  
  /* Inlined {  type :'SYMBOL' | 'PRODUCT' | 'SUM' | 'INVERSE' | 'NEGATE' | 'POWER',   value :string} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (variables : evaluatex.evaluatex.Variables | undefined): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  @js.native
  trait typeSYMBOLPRODUCTSUMINVER
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode] = js.native
    
    def evaluate(): Double = js.native
    def evaluate(variables: Variables): Double = js.native
    
    var name: Null | String = js.native
    
    def simplify(): AbstractSyntaxTreeNode = js.native
    
    var `type`: SYMBOL | PRODUCT | SUM | INVERSE | NEGATE | POWER = js.native
    
    var value: String = js.native
  }
}
