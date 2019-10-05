package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue_ () extends Message {
  def getValue(): Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): Uint8Array = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Uint8Array): Unit = js.native
}

