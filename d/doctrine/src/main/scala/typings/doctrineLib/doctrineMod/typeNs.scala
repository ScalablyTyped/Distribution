package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doctrine", "type")
@js.native
object typeNs extends js.Object {
  trait AllLiteral extends js.Object {
    var `type`: doctrineLib.doctrineLibStrings.AllLiteral
  }
  
  trait ArrayType extends js.Object {
    var elements: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.ArrayType
  }
  
  trait FieldType extends js.Object {
    var key: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.FieldType
    var value: js.UndefOr[doctrineLib.doctrineMod.Type] = js.undefined
  }
  
  trait FunctionType extends js.Object {
    var `new`: doctrineLib.doctrineMod.Type
    var params: js.Array[doctrineLib.doctrineMod.Type]
    var result: js.Array[doctrineLib.doctrineMod.Type]
    var `this`: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.FunctionType
  }
  
  trait NameExpression extends js.Object {
    var name: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.NameExpression
  }
  
  trait NonNullableType extends js.Object {
    var expression: doctrineLib.doctrineMod.Type
    var prefix: scala.Boolean
    var `type`: doctrineLib.doctrineLibStrings.NonNullableType
  }
  
  trait NullLiteral extends js.Object {
    var `type`: doctrineLib.doctrineLibStrings.NullLiteral
  }
  
  trait NullableLiteral extends js.Object {
    var `type`: doctrineLib.doctrineLibStrings.NullableLiteral
  }
  
  trait NullableType extends js.Object {
    var expression: doctrineLib.doctrineMod.Type
    var prefix: scala.Boolean
    var `type`: doctrineLib.doctrineLibStrings.NullableType
  }
  
  trait OptionalType extends js.Object {
    var expression: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.OptionalType
  }
  
  trait ParameterType extends js.Object {
    var expression: doctrineLib.doctrineMod.Type
    var name: java.lang.String
    var `type`: doctrineLib.doctrineLibStrings.ParameterType
  }
  
  trait RecordType extends js.Object {
    var fields: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.RecordType
  }
  
  trait RestType extends js.Object {
    var expression: js.UndefOr[doctrineLib.doctrineMod.Type] = js.undefined
    var `type`: doctrineLib.doctrineLibStrings.RestType
  }
  
  trait TypeApplication extends js.Object {
    var applications: js.Array[doctrineLib.doctrineMod.Type]
    var expression: doctrineLib.doctrineMod.Type
    var `type`: doctrineLib.doctrineLibStrings.TypeApplication
  }
  
  trait UndefinedLiteral extends js.Object {
    var `type`: doctrineLib.doctrineLibStrings.UndefinedLiteral
  }
  
  trait UnionType extends js.Object {
    var elements: js.Array[doctrineLib.doctrineMod.Type]
    var `type`: doctrineLib.doctrineLibStrings.UnionType
  }
  
  trait VoidLiteral extends js.Object {
    var `type`: doctrineLib.doctrineLibStrings.VoidLiteral
  }
  
  val Syntax: doctrineLib.Anon_AllLiteral = js.native
  def parseParamType(src: java.lang.String): doctrineLib.doctrineMod.Type = js.native
  def parseParamType(src: java.lang.String, options: doctrineLib.Anon_Midstream): doctrineLib.doctrineMod.Type = js.native
  def parseType(src: java.lang.String): doctrineLib.doctrineMod.Type = js.native
  def parseType(src: java.lang.String, options: doctrineLib.Anon_Midstream): doctrineLib.doctrineMod.Type = js.native
  def stringify(`type`: doctrineLib.doctrineMod.Type): java.lang.String = js.native
}

