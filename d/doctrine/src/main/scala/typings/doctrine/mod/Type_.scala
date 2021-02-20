package typings.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.doctrine.mod.`type`.AllLiteral
  - typings.doctrine.mod.`type`.ArrayType
  - typings.doctrine.mod.`type`.FieldType
  - typings.doctrine.mod.`type`.FunctionType
  - typings.doctrine.mod.`type`.NameExpression
  - typings.doctrine.mod.`type`.NonNullableType
  - typings.doctrine.mod.`type`.NullableLiteral
  - typings.doctrine.mod.`type`.NullableType
  - typings.doctrine.mod.`type`.NullLiteral
  - typings.doctrine.mod.`type`.OptionalType
  - typings.doctrine.mod.`type`.ParameterType
  - typings.doctrine.mod.`type`.RecordType
  - typings.doctrine.mod.`type`.RestType
  - typings.doctrine.mod.`type`.TypeApplication
  - typings.doctrine.mod.`type`.UndefinedLiteral
  - typings.doctrine.mod.`type`.UnionType
  - typings.doctrine.mod.`type`.VoidLiteral
*/
trait Type_ extends StObject
object Type_ {
  
  @scala.inline
  def AllLiteral(`type`: typings.doctrine.doctrineStrings.AllLiteral): typings.doctrine.mod.`type`.AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.AllLiteral]
  }
  
  @scala.inline
  def ArrayType(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.ArrayType): typings.doctrine.mod.`type`.ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.ArrayType]
  }
  
  @scala.inline
  def FieldType(key: String, `type`: typings.doctrine.doctrineStrings.FieldType): typings.doctrine.mod.`type`.FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.FieldType]
  }
  
  @scala.inline
  def FunctionType(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typings.doctrine.doctrineStrings.FunctionType
  ): typings.doctrine.mod.`type`.FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.FunctionType]
  }
  
  @scala.inline
  def NameExpression(name: String, `type`: typings.doctrine.doctrineStrings.NameExpression): typings.doctrine.mod.`type`.NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NameExpression]
  }
  
  @scala.inline
  def NonNullableType(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NonNullableType): typings.doctrine.mod.`type`.NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NonNullableType]
  }
  
  @scala.inline
  def NullLiteral(`type`: typings.doctrine.doctrineStrings.NullLiteral): typings.doctrine.mod.`type`.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullLiteral]
  }
  
  @scala.inline
  def NullableLiteral(`type`: typings.doctrine.doctrineStrings.NullableLiteral): typings.doctrine.mod.`type`.NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullableLiteral]
  }
  
  @scala.inline
  def NullableType(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NullableType): typings.doctrine.mod.`type`.NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullableType]
  }
  
  @scala.inline
  def OptionalType(expression: Type_, `type`: typings.doctrine.doctrineStrings.OptionalType): typings.doctrine.mod.`type`.OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.OptionalType]
  }
  
  @scala.inline
  def ParameterType(expression: Type_, name: String, `type`: typings.doctrine.doctrineStrings.ParameterType): typings.doctrine.mod.`type`.ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.ParameterType]
  }
  
  @scala.inline
  def RecordType(fields: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.RecordType): typings.doctrine.mod.`type`.RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.RecordType]
  }
  
  @scala.inline
  def RestType(`type`: typings.doctrine.doctrineStrings.RestType): typings.doctrine.mod.`type`.RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.RestType]
  }
  
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): typings.doctrine.mod.`type`.TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.TypeApplication]
  }
  
  @scala.inline
  def UndefinedLiteral(`type`: typings.doctrine.doctrineStrings.UndefinedLiteral): typings.doctrine.mod.`type`.UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.UndefinedLiteral]
  }
  
  @scala.inline
  def UnionType(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.UnionType): typings.doctrine.mod.`type`.UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.UnionType]
  }
  
  @scala.inline
  def VoidLiteral(`type`: typings.doctrine.doctrineStrings.VoidLiteral): typings.doctrine.mod.`type`.VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.doctrine.mod.`type`.VoidLiteral]
  }
}
