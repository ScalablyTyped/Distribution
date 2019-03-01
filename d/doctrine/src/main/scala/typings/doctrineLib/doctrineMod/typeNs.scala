package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doctrine", "type")
@js.native
object typeNs extends js.Object {
  trait AllLiteral
    extends doctrineLib.doctrineMod.Type {
    var `type`: doctrineLib.doctrineLibStrings.AllLiteral
  }
  
  trait ArrayType
    extends doctrineLib.doctrineMod.Type {
    var elements: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.ArrayType
  }
  
  trait FieldType
    extends doctrineLib.doctrineMod.Type {
    var key: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.FieldType
    var value: js.UndefOr[doctrineLib.doctrineMod.Type] = js.undefined
  }
  
  trait FunctionType
    extends doctrineLib.doctrineMod.Type {
    var `new`: doctrineLib.doctrineMod.Type
    var params: js.Array[doctrineLib.doctrineMod.Type]
    var result: js.Array[doctrineLib.doctrineMod.Type]
    var `this`: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.FunctionType
  }
  
  trait NameExpression
    extends doctrineLib.doctrineMod.Type {
    var name: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.NameExpression
  }
  
  trait NonNullableType
    extends doctrineLib.doctrineMod.Type {
    var expression: doctrineLib.doctrineMod.Type
    var prefix: scala.Boolean
    var `type`: doctrineLib.doctrineLibStrings.NonNullableType
  }
  
  trait NullLiteral
    extends doctrineLib.doctrineMod.Type {
    var `type`: doctrineLib.doctrineLibStrings.NullLiteral
  }
  
  trait NullableLiteral
    extends doctrineLib.doctrineMod.Type {
    var `type`: doctrineLib.doctrineLibStrings.NullableLiteral
  }
  
  trait NullableType
    extends doctrineLib.doctrineMod.Type {
    var expression: doctrineLib.doctrineMod.Type
    var prefix: scala.Boolean
    var `type`: doctrineLib.doctrineLibStrings.NullableType
  }
  
  trait OptionalType
    extends doctrineLib.doctrineMod.Type {
    var expression: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.OptionalType
  }
  
  trait ParameterType
    extends doctrineLib.doctrineMod.Type {
    var expression: doctrineLib.doctrineMod.Type
    var name: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.ParameterType
  }
  
  trait RecordType
    extends doctrineLib.doctrineMod.Type {
    var fields: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.RecordType
  }
  
  trait RestType
    extends doctrineLib.doctrineMod.Type {
    var expression: js.UndefOr[doctrineLib.doctrineMod.Type] = js.undefined
    var `type`: doctrineLib.doctrineLibStrings.RestType
  }
  
  trait TypeApplication
    extends doctrineLib.doctrineMod.Type {
    var applications: js.Array[doctrineLib.doctrineMod.Type]
    var expression: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.TypeApplication
  }
  
  trait UndefinedLiteral
    extends doctrineLib.doctrineMod.Type {
    var `type`: doctrineLib.doctrineLibStrings.UndefinedLiteral
  }
  
  trait UnionType
    extends doctrineLib.doctrineMod.Type {
    var elements: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.UnionType
  }
  
  trait VoidLiteral
    extends doctrineLib.doctrineMod.Type {
    var `type`: doctrineLib.doctrineLibStrings.VoidLiteral
  }
  
  val Syntax: doctrineLib.Anon_AllLiteral = js.native
  def parseParamType(src: java.lang.String): doctrineLib.doctrineMod.Type = js.native
  def parseParamType(src: java.lang.String, options: doctrineLib.Anon_Midstream): doctrineLib.doctrineMod.Type = js.native
  def parseType(src: java.lang.String): doctrineLib.doctrineMod.Type = js.native
  def parseType(src: java.lang.String, options: doctrineLib.Anon_Midstream): doctrineLib.doctrineMod.Type = js.native
  def stringify(`type`: doctrineLib.doctrineMod.Type): java.lang.String = js.native
}

