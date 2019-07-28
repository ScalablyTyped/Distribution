package typings.googleDashProtobuf.googleProtobufDurationUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDurationUnderscorePbMod.DurationNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/duration_pb", "Duration")
@js.native
class Duration () extends Message {
  def getNanos(): Double = js.native
  def getSeconds(): Double = js.native
  def setNanos(value: Double): Unit = js.native
  def setSeconds(value: Double): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/duration_pb", "Duration")
@js.native
object Duration extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Duration = js.native
  def deserializeBinaryFromReader(message: Duration, reader: BinaryReader): Duration = js.native
  def serializeBinaryToWriter(message: Duration, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Duration): AsObject = js.native
}

