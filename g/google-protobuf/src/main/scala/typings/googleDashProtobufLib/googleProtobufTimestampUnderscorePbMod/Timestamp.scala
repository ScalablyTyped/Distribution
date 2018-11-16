package typings
package googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
class Timestamp ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def fromDate(date: stdLib.Date): scala.Unit = js.native
  def getNanos(): scala.Double = js.native
  def getSeconds(): scala.Double = js.native
  def setNanos(value: scala.Double): scala.Unit = js.native
  def setSeconds(value: scala.Double): scala.Unit = js.native
  def toDate(): stdLib.Date = js.native
}

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
object Timestamp extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.Timestamp = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.Timestamp,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.Timestamp = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.Timestamp,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.Timestamp
  ): googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject = js.native
}

