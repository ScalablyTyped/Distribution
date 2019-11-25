package typings.doctrine.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.doctrine.doctrineMod.`type`.AllLiteral
  - typings.doctrine.doctrineMod.`type`.ArrayType
  - typings.doctrine.doctrineMod.`type`.FieldType
  - typings.doctrine.doctrineMod.`type`.FunctionType
  - typings.doctrine.doctrineMod.`type`.NameExpression
  - typings.doctrine.doctrineMod.`type`.NonNullableType
  - typings.doctrine.doctrineMod.`type`.NullableLiteral
  - typings.doctrine.doctrineMod.`type`.NullableType
  - typings.doctrine.doctrineMod.`type`.NullLiteral
  - typings.doctrine.doctrineMod.`type`.OptionalType
  - typings.doctrine.doctrineMod.`type`.ParameterType
  - typings.doctrine.doctrineMod.`type`.RecordType
  - typings.doctrine.doctrineMod.`type`.RestType
  - typings.doctrine.doctrineMod.`type`.TypeApplication
  - typings.doctrine.doctrineMod.`type`.UndefinedLiteral
  - typings.doctrine.doctrineMod.`type`.UnionType
  - typings.doctrine.doctrineMod.`type`.VoidLiteral
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def NullableType(expression: Type, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NullableType): Type = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NonNullableType(expression: Type, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NonNullableType): Type = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def FieldType(key: String, `type`: typings.doctrine.doctrineStrings.FieldType, value: Type = null): Type = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def FunctionType(
    `new`: Type,
    params: js.Array[Type],
    result: js.Array[Type],
    `this`: Type,
    `type`: typings.doctrine.doctrineStrings.FunctionType
  ): Type = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NullableLiteral(`type`: typings.doctrine.doctrineStrings.NullableLiteral): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NameExpression(name: String, `type`: typings.doctrine.doctrineStrings.NameExpression): Type = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def ParameterType(expression: Type, name: String, `type`: typings.doctrine.doctrineStrings.ParameterType): Type = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def VoidLiteral(`type`: typings.doctrine.doctrineStrings.VoidLiteral): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def ArrayType(elements: js.Array[Type], `type`: typings.doctrine.doctrineStrings.ArrayType): Type = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type],
    expression: Type,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): Type = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NullLiteral(`type`: typings.doctrine.doctrineStrings.NullLiteral): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def RestType(`type`: typings.doctrine.doctrineStrings.RestType, expression: Type = null): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def UnionType(elements: js.Array[Type], `type`: typings.doctrine.doctrineStrings.UnionType): Type = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def AllLiteral(`type`: typings.doctrine.doctrineStrings.AllLiteral): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def OptionalType(expression: Type, `type`: typings.doctrine.doctrineStrings.OptionalType): Type = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def RecordType(fields: js.Array[Type], `type`: typings.doctrine.doctrineStrings.RecordType): Type = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def UndefinedLiteral(`type`: typings.doctrine.doctrineStrings.UndefinedLiteral): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

