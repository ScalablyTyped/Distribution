package typings
package googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
class FieldMask ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addPaths(value: java.lang.String): java.lang.String = js.native
  def addPaths(value: java.lang.String, index: scala.Double): java.lang.String = js.native
  def clearPathsList(): scala.Unit = js.native
  def getPathsList(): js.Array[java.lang.String] = js.native
  def setPathsList(value: js.Array[java.lang.String]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
object FieldMask extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMask = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMask,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMask = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMask,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMask
  ): googleDashProtobufLib.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMaskNs.AsObject = js.native
}

