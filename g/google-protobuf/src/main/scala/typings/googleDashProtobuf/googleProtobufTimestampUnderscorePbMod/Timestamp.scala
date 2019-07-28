package typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
class Timestamp () extends Message {
  def fromDate(date: Date): Unit = js.native
  def getNanos(): Double = js.native
  def getSeconds(): Double = js.native
  def setNanos(value: Double): Unit = js.native
  def setSeconds(value: Double): Unit = js.native
  def toDate(): Date = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
object Timestamp extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Timestamp = js.native
  def deserializeBinaryFromReader(message: Timestamp, reader: BinaryReader): Timestamp = js.native
  def serializeBinaryToWriter(message: Timestamp, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Timestamp): AsObject = js.native
}

