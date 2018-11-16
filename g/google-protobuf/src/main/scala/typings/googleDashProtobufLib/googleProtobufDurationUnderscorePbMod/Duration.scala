package typings
package googleDashProtobufLib.googleProtobufDurationUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/duration_pb", "Duration")
@js.native
class Duration ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getNanos(): scala.Double = js.native
  def getSeconds(): scala.Double = js.native
  def setNanos(value: scala.Double): scala.Unit = js.native
  def setSeconds(value: scala.Double): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/duration_pb", "Duration")
@js.native
object Duration extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.Duration = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.Duration,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.Duration = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.Duration,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.Duration
  ): googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.DurationNs.AsObject = js.native
}

