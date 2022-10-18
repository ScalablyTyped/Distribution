package typings.fluentBundle

import typings.fluentBundle.fluentBundleStrings.`var`
import typings.fluentBundle.fluentBundleStrings.func
import typings.fluentBundle.fluentBundleStrings.mesg
import typings.fluentBundle.fluentBundleStrings.narg
import typings.fluentBundle.fluentBundleStrings.num
import typings.fluentBundle.fluentBundleStrings.select
import typings.fluentBundle.fluentBundleStrings.str
import typings.fluentBundle.fluentBundleStrings.term
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAstMod {
  
  type ComplexPattern = js.Array[PatternElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentBundle.esmAstMod.SelectExpression
    - typings.fluentBundle.esmAstMod.VariableReference
    - typings.fluentBundle.esmAstMod.TermReference
    - typings.fluentBundle.esmAstMod.MessageReference
    - typings.fluentBundle.esmAstMod.FunctionReference
    - typings.fluentBundle.esmAstMod.Literal
  */
  trait Expression extends StObject
  object Expression {
    
    inline def FunctionReference(args: js.Array[Expression | NamedArgument], name: String): typings.fluentBundle.esmAstMod.FunctionReference = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("func")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.FunctionReference]
    }
    
    inline def MessageReference(name: String): typings.fluentBundle.esmAstMod.MessageReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], attr = null)
      __obj.updateDynamic("type")("mesg")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.MessageReference]
    }
    
    inline def NumberLiteral(precision: Double, value: Double): typings.fluentBundle.esmAstMod.NumberLiteral = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("num")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.NumberLiteral]
    }
    
    inline def SelectExpression(selector: Expression, star: Double, variants: js.Array[Variant]): typings.fluentBundle.esmAstMod.SelectExpression = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("select")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.SelectExpression]
    }
    
    inline def StringLiteral(value: String): typings.fluentBundle.esmAstMod.StringLiteral = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("str")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.StringLiteral]
    }
    
    inline def TermReference(args: js.Array[Expression | NamedArgument], name: String): typings.fluentBundle.esmAstMod.TermReference = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], attr = null)
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.TermReference]
    }
    
    inline def VariableReference(name: String): typings.fluentBundle.esmAstMod.VariableReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("var")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.VariableReference]
    }
  }
  
  trait FunctionReference
    extends StObject
       with Expression {
    
    var args: js.Array[Expression | NamedArgument]
    
    var name: String
    
    var `type`: func
  }
  object FunctionReference {
    
    inline def apply(args: js.Array[Expression | NamedArgument], name: String): FunctionReference = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("func")
      __obj.asInstanceOf[FunctionReference]
    }
    
    extension [Self <: FunctionReference](x: Self) {
      
      inline def setArgs(value: js.Array[Expression | NamedArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: (Expression | NamedArgument)*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: func): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentBundle.esmAstMod.StringLiteral
    - typings.fluentBundle.esmAstMod.NumberLiteral
  */
  trait Literal
    extends StObject
       with Expression
  object Literal {
    
    inline def NumberLiteral(precision: Double, value: Double): typings.fluentBundle.esmAstMod.NumberLiteral = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("num")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.NumberLiteral]
    }
    
    inline def StringLiteral(value: String): typings.fluentBundle.esmAstMod.StringLiteral = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("str")
      __obj.asInstanceOf[typings.fluentBundle.esmAstMod.StringLiteral]
    }
  }
  
  trait Message extends StObject {
    
    var attributes: Record[String, Pattern]
    
    var id: String
    
    var value: Pattern | Null
  }
  object Message {
    
    inline def apply(attributes: Record[String, Pattern], id: String): Message = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setAttributes(value: Record[String, Pattern]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: PatternElement*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait MessageReference
    extends StObject
       with Expression {
    
    var attr: String | Null
    
    var name: String
    
    var `type`: mesg
  }
  object MessageReference {
    
    inline def apply(name: String): MessageReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], attr = null)
      __obj.updateDynamic("type")("mesg")
      __obj.asInstanceOf[MessageReference]
    }
    
    extension [Self <: MessageReference](x: Self) {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrNull: Self = StObject.set(x, "attr", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: mesg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedArgument extends StObject {
    
    var name: String
    
    var `type`: narg
    
    var value: Literal
  }
  object NamedArgument {
    
    inline def apply(name: String, value: Literal): NamedArgument = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("narg")
      __obj.asInstanceOf[NamedArgument]
    }
    
    extension [Self <: NamedArgument](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: narg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Literal): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberLiteral
    extends StObject
       with Literal {
    
    var precision: Double
    
    var `type`: num
    
    var value: Double
  }
  object NumberLiteral {
    
    inline def apply(precision: Double, value: Double): NumberLiteral = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("num")
      __obj.asInstanceOf[NumberLiteral]
    }
    
    extension [Self <: NumberLiteral](x: Self) {
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setType(value: num): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Pattern = String | ComplexPattern
  
  type PatternElement = String | Expression
  
  trait SelectExpression
    extends StObject
       with Expression {
    
    var selector: Expression
    
    var star: Double
    
    var `type`: select
    
    var variants: js.Array[Variant]
  }
  object SelectExpression {
    
    inline def apply(selector: Expression, star: Double, variants: js.Array[Variant]): SelectExpression = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("select")
      __obj.asInstanceOf[SelectExpression]
    }
    
    extension [Self <: SelectExpression](x: Self) {
      
      inline def setSelector(value: Expression): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setStar(value: Double): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  trait StringLiteral
    extends StObject
       with Literal {
    
    var `type`: str
    
    var value: String
  }
  object StringLiteral {
    
    inline def apply(value: String): StringLiteral = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("str")
      __obj.asInstanceOf[StringLiteral]
    }
    
    extension [Self <: StringLiteral](x: Self) {
      
      inline def setType(value: str): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Term extends StObject {
    
    var attributes: Record[String, Pattern]
    
    var id: String
    
    var value: Pattern
  }
  object Term {
    
    inline def apply(attributes: Record[String, Pattern], id: String, value: Pattern): Term = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    extension [Self <: Term](x: Self) {
      
      inline def setAttributes(value: Record[String, Pattern]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: PatternElement*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait TermReference
    extends StObject
       with Expression {
    
    var args: js.Array[Expression | NamedArgument]
    
    var attr: String | Null
    
    var name: String
    
    var `type`: term
  }
  object TermReference {
    
    inline def apply(args: js.Array[Expression | NamedArgument], name: String): TermReference = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], attr = null)
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[TermReference]
    }
    
    extension [Self <: TermReference](x: Self) {
      
      inline def setArgs(value: js.Array[Expression | NamedArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: (Expression | NamedArgument)*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrNull: Self = StObject.set(x, "attr", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: term): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariableReference
    extends StObject
       with Expression {
    
    var name: String
    
    var `type`: `var`
  }
  object VariableReference {
    
    inline def apply(name: String): VariableReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("var")
      __obj.asInstanceOf[VariableReference]
    }
    
    extension [Self <: VariableReference](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: `var`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variant extends StObject {
    
    var key: Literal
    
    var value: Pattern
  }
  object Variant {
    
    inline def apply(key: Literal, value: Pattern): Variant = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    extension [Self <: Variant](x: Self) {
      
      inline def setKey(value: Literal): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: PatternElement*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
