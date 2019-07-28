package typings.doctrine.doctrineMod

import typings.doctrine.Anon_Midstream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doctrine", "type")
@js.native
object typeNs extends js.Object {
  trait AllLiteral extends Type {
    var `type`: typings.doctrine.doctrineStrings.AllLiteral
  }
  
  trait ArrayType extends Type {
    var elements: js.Array[Type]
    var `type`: typings.doctrine.doctrineStrings.ArrayType
  }
  
  trait FieldType extends Type {
    var key: String
    var `type`: typings.doctrine.doctrineStrings.FieldType
    var value: js.UndefOr[Type] = js.undefined
  }
  
  trait FunctionType extends Type {
    var `new`: Type
    var params: js.Array[Type]
    var result: js.Array[Type]
    var `this`: Type
    var `type`: typings.doctrine.doctrineStrings.FunctionType
  }
  
  trait NameExpression extends Type {
    var name: String
    var `type`: typings.doctrine.doctrineStrings.NameExpression
  }
  
  trait NonNullableType extends Type {
    var expression: Type
    var prefix: Boolean
    var `type`: typings.doctrine.doctrineStrings.NonNullableType
  }
  
  trait NullLiteral extends Type {
    var `type`: typings.doctrine.doctrineStrings.NullLiteral
  }
  
  trait NullableLiteral extends Type {
    var `type`: typings.doctrine.doctrineStrings.NullableLiteral
  }
  
  trait NullableType extends Type {
    var expression: Type
    var prefix: Boolean
    var `type`: typings.doctrine.doctrineStrings.NullableType
  }
  
  trait OptionalType extends Type {
    var expression: Type
    var `type`: typings.doctrine.doctrineStrings.OptionalType
  }
  
  trait ParameterType extends Type {
    var expression: Type
    var name: String
    var `type`: typings.doctrine.doctrineStrings.ParameterType
  }
  
  trait RecordType extends Type {
    var fields: js.Array[Type]
    var `type`: typings.doctrine.doctrineStrings.RecordType
  }
  
  trait RestType extends Type {
    var expression: js.UndefOr[Type] = js.undefined
    var `type`: typings.doctrine.doctrineStrings.RestType
  }
  
  trait TypeApplication extends Type {
    var applications: js.Array[Type]
    var expression: Type
    var `type`: typings.doctrine.doctrineStrings.TypeApplication
  }
  
  trait UndefinedLiteral extends Type {
    var `type`: typings.doctrine.doctrineStrings.UndefinedLiteral
  }
  
  trait UnionType extends Type {
    var elements: js.Array[Type]
    var `type`: typings.doctrine.doctrineStrings.UnionType
  }
  
  trait VoidLiteral extends Type {
    var `type`: typings.doctrine.doctrineStrings.VoidLiteral
  }
  
  def parseParamType(src: String): Type = js.native
  def parseParamType(src: String, options: Anon_Midstream): Type = js.native
  def parseType(src: String): Type = js.native
  def parseType(src: String, options: Anon_Midstream): Type = js.native
  def stringify(`type`: Type): String = js.native
  @js.native
  object Syntax extends js.Object {
    var AllLiteral: typings.doctrine.doctrineStrings.AllLiteral = js.native
    var ArrayType: typings.doctrine.doctrineStrings.ArrayType = js.native
    var FieldType: typings.doctrine.doctrineStrings.FieldType = js.native
    var FunctionType: typings.doctrine.doctrineStrings.FunctionType = js.native
    var NameExpression: typings.doctrine.doctrineStrings.NameExpression = js.native
    var NonNullableType: typings.doctrine.doctrineStrings.NonNullableType = js.native
    var NullLiteral: typings.doctrine.doctrineStrings.NullLiteral = js.native
    var NullableLiteral: typings.doctrine.doctrineStrings.NullableLiteral = js.native
    var NullableType: typings.doctrine.doctrineStrings.NullableType = js.native
    var OptionalType: typings.doctrine.doctrineStrings.OptionalType = js.native
    var ParameterType: typings.doctrine.doctrineStrings.ParameterType = js.native
    var RecordType: typings.doctrine.doctrineStrings.RecordType = js.native
    var RestType: typings.doctrine.doctrineStrings.RestType = js.native
    var TypeApplication: typings.doctrine.doctrineStrings.TypeApplication = js.native
    var UndefinedLiteral: typings.doctrine.doctrineStrings.UndefinedLiteral = js.native
    var UnionType: typings.doctrine.doctrineStrings.UnionType = js.native
    var VoidLiteral: typings.doctrine.doctrineStrings.VoidLiteral = js.native
  }
  
}

