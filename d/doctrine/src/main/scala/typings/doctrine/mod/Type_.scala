package typings.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def AllLiteral(): typings.doctrine.mod.`type`.AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AllLiteral")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.AllLiteral]
  }
  
  inline def ArrayType(elements: js.Array[Type_]): typings.doctrine.mod.`type`.ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.ArrayType]
  }
  
  inline def FieldType(key: String): typings.doctrine.mod.`type`.FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FieldType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.FieldType]
  }
  
  inline def FunctionType(`new`: Type_, params: js.Array[Type_], result: Type_, `this`: Type_): typings.doctrine.mod.`type`.FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.FunctionType]
  }
  
  inline def NameExpression(name: String): typings.doctrine.mod.`type`.NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NameExpression")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NameExpression]
  }
  
  inline def NonNullableType(expression: Type_, prefix: Boolean): typings.doctrine.mod.`type`.NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NonNullableType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NonNullableType]
  }
  
  inline def NullLiteral(): typings.doctrine.mod.`type`.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullLiteral]
  }
  
  inline def NullableLiteral(): typings.doctrine.mod.`type`.NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableLiteral")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullableLiteral]
  }
  
  inline def NullableType(expression: Type_, prefix: Boolean): typings.doctrine.mod.`type`.NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.NullableType]
  }
  
  inline def OptionalType(expression: Type_): typings.doctrine.mod.`type`.OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.OptionalType]
  }
  
  inline def ParameterType(expression: Type_, name: String): typings.doctrine.mod.`type`.ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.ParameterType]
  }
  
  inline def RecordType(fields: js.Array[Type_]): typings.doctrine.mod.`type`.RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RecordType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.RecordType]
  }
  
  inline def RestType(): typings.doctrine.mod.`type`.RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.RestType]
  }
  
  inline def TypeApplication(applications: js.Array[Type_], expression: Type_): typings.doctrine.mod.`type`.TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeApplication")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.TypeApplication]
  }
  
  inline def UndefinedLiteral(): typings.doctrine.mod.`type`.UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.UndefinedLiteral]
  }
  
  inline def UnionType(elements: js.Array[Type_]): typings.doctrine.mod.`type`.UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionType")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.UnionType]
  }
  
  inline def VoidLiteral(): typings.doctrine.mod.`type`.VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidLiteral")
    __obj.asInstanceOf[typings.doctrine.mod.`type`.VoidLiteral]
  }
}
