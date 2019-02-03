package typings
package googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
@js.native
class Empty ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message

/* static members */
@JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
@js.native
object Empty extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.Empty = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.Empty,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.Empty = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.Empty,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.Empty
  ): googleDashProtobufLib.googleProtobufEmptyUnderscorePbMod.EmptyNs.AsObject = js.native
}

