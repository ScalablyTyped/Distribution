package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
class FieldDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearDefaultValue(): scala.Unit = js.native
  def clearExtendee(): scala.Unit = js.native
  def clearJsonName(): scala.Unit = js.native
  def clearLabel(): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearNumber(): scala.Unit = js.native
  def clearOneofIndex(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearType(): scala.Unit = js.native
  def clearTypeName(): scala.Unit = js.native
  def getDefaultValue(): java.lang.String = js.native
  def getExtendee(): java.lang.String = js.native
  def getJsonName(): java.lang.String = js.native
  def getLabel(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label = js.native
  def getName(): java.lang.String = js.native
  def getNumber(): scala.Double = js.native
  def getOneofIndex(): scala.Double = js.native
  def getOptions(): FieldOptions = js.native
  def getType(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type = js.native
  def getTypeName(): java.lang.String = js.native
  def hasDefaultValue(): scala.Boolean = js.native
  def hasExtendee(): scala.Boolean = js.native
  def hasJsonName(): scala.Boolean = js.native
  def hasLabel(): scala.Boolean = js.native
  def hasName(): scala.Boolean = js.native
  def hasNumber(): scala.Boolean = js.native
  def hasOneofIndex(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def hasType(): scala.Boolean = js.native
  def hasTypeName(): scala.Boolean = js.native
  def setDefaultValue(value: java.lang.String): scala.Unit = js.native
  def setExtendee(value: java.lang.String): scala.Unit = js.native
  def setJsonName(value: java.lang.String): scala.Unit = js.native
  def setLabel(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setNumber(value: scala.Double): scala.Unit = js.native
  def setOneofIndex(value: scala.Double): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: FieldOptions): scala.Unit = js.native
  def setType(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type): scala.Unit = js.native
  def setTypeName(value: java.lang.String): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
object FieldDescriptorProto extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject = js.native
}

