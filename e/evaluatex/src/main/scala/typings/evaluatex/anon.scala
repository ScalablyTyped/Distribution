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
  
  /* Inlined {  type :'FUNCTION',   value :{  name :keyof evaluatex.evaluatex.IncludeMethods<std.Math> | undefined} & (args : ...unknown): number,   name :string | null} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  trait typeFUNCTIONvaluenamekeyo
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode]
    
    def evaluate(): Double
    
    var name: (String | Null) & (Null | String)
    
    def simplify(): AbstractSyntaxTreeNode
    
    var `type`: FUNCTION
    
    def value(args: Any*): Double
    @JSName("value")
    var value_Original: Name & (js.Function1[/* repeated */ Any, Double])
  }
  object typeFUNCTIONvaluenamekeyo {
    
    inline def apply(
      children: js.Array[AbstractSyntaxTreeNode],
      evaluate: () => Double,
      name: (String | Null) & (Null | String),
      simplify: () => AbstractSyntaxTreeNode,
      value: Name & (js.Function1[/* repeated */ Any, Double])
    ): typeFUNCTIONvaluenamekeyo = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], evaluate = js.Any.fromFunction0(evaluate), name = name.asInstanceOf[js.Any], simplify = js.Any.fromFunction0(simplify), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FUNCTION")
      __obj.asInstanceOf[typeFUNCTIONvaluenamekeyo]
    }
    
    extension [Self <: typeFUNCTIONvaluenamekeyo](x: Self) {
      
      inline def setChildren(value: js.Array[AbstractSyntaxTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: AbstractSyntaxTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setEvaluate(value: () => Double): Self = StObject.set(x, "evaluate", js.Any.fromFunction0(value))
      
      inline def setName(value: (String | Null) & (Null | String)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSimplify(value: () => AbstractSyntaxTreeNode): Self = StObject.set(x, "simplify", js.Any.fromFunction0(value))
      
      inline def setType(value: FUNCTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Name & (js.Function1[/* repeated */ Any, Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'NUMBER',   value :number} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  trait typeNUMBERvaluenumberchil
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode]
    
    def evaluate(): Double
    
    var name: Null | String
    
    def simplify(): AbstractSyntaxTreeNode
    
    var `type`: NUMBER
    
    var value: Double
  }
  object typeNUMBERvaluenumberchil {
    
    inline def apply(
      children: js.Array[AbstractSyntaxTreeNode],
      evaluate: () => Double,
      simplify: () => AbstractSyntaxTreeNode,
      value: Double
    ): typeNUMBERvaluenumberchil = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], evaluate = js.Any.fromFunction0(evaluate), simplify = js.Any.fromFunction0(simplify), value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")("NUMBER")
      __obj.asInstanceOf[typeNUMBERvaluenumberchil]
    }
    
    extension [Self <: typeNUMBERvaluenumberchil](x: Self) {
      
      inline def setChildren(value: js.Array[AbstractSyntaxTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: AbstractSyntaxTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setEvaluate(value: () => Double): Self = StObject.set(x, "evaluate", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSimplify(value: () => AbstractSyntaxTreeNode): Self = StObject.set(x, "simplify", js.Any.fromFunction0(value))
      
      inline def setType(value: NUMBER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'SYMBOL' | 'PRODUCT' | 'SUM' | 'INVERSE' | 'NEGATE' | 'POWER',   value :string} & {  children :std.Array<evaluatex.evaluatex.AbstractSyntaxTreeNode>,   name :null | string, evaluate (): number, simplify (): evaluatex.evaluatex.AbstractSyntaxTreeNode} */
  trait typeSYMBOLPRODUCTSUMINVER
    extends StObject
       with AbstractSyntaxTreeNode {
    
    var children: js.Array[AbstractSyntaxTreeNode]
    
    def evaluate(): Double
    
    var name: Null | String
    
    def simplify(): AbstractSyntaxTreeNode
    
    var `type`: SYMBOL | PRODUCT | SUM | INVERSE | NEGATE | POWER
    
    var value: String
  }
  object typeSYMBOLPRODUCTSUMINVER {
    
    inline def apply(
      children: js.Array[AbstractSyntaxTreeNode],
      evaluate: () => Double,
      simplify: () => AbstractSyntaxTreeNode,
      `type`: SYMBOL | PRODUCT | SUM | INVERSE | NEGATE | POWER,
      value: String
    ): typeSYMBOLPRODUCTSUMINVER = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], evaluate = js.Any.fromFunction0(evaluate), simplify = js.Any.fromFunction0(simplify), value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typeSYMBOLPRODUCTSUMINVER]
    }
    
    extension [Self <: typeSYMBOLPRODUCTSUMINVER](x: Self) {
      
      inline def setChildren(value: js.Array[AbstractSyntaxTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: AbstractSyntaxTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setEvaluate(value: () => Double): Self = StObject.set(x, "evaluate", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSimplify(value: () => AbstractSyntaxTreeNode): Self = StObject.set(x, "simplify", js.Any.fromFunction0(value))
      
      inline def setType(value: SYMBOL | PRODUCT | SUM | INVERSE | NEGATE | POWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
