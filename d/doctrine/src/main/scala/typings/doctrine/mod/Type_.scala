package typings.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Type_ extends js.Object

object Type_ {
  @scala.inline
  def NullLiteral(`type`: typings.doctrine.doctrineStrings.NullLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NonNullableType(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NonNullableType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RecordType(fields: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.RecordType): Type_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): Type_ = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def VoidLiteral(`type`: typings.doctrine.doctrineStrings.VoidLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def OptionalType(expression: Type_, `type`: typings.doctrine.doctrineStrings.OptionalType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FieldType(key: String, `type`: typings.doctrine.doctrineStrings.FieldType, value: Type_ = null): Type_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NameExpression(name: String, `type`: typings.doctrine.doctrineStrings.NameExpression): Type_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableLiteral(`type`: typings.doctrine.doctrineStrings.NullableLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ArrayType(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.ArrayType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FunctionType(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typings.doctrine.doctrineStrings.FunctionType
  ): Type_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableType(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NullableType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ParameterType(expression: Type_, name: String, `type`: typings.doctrine.doctrineStrings.ParameterType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UnionType(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.UnionType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def AllLiteral(`type`: typings.doctrine.doctrineStrings.AllLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RestType(`type`: typings.doctrine.doctrineStrings.RestType, expression: Type_ = null): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UndefinedLiteral(`type`: typings.doctrine.doctrineStrings.UndefinedLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
}

