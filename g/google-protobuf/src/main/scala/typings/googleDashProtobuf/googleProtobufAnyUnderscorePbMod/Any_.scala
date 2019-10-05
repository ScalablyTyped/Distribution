package typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
class Any_ () extends Message {
  def getTypeName(): String = js.native
  def getTypeUrl(): String = js.native
  def getValue(): Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): Uint8Array = js.native
  def pack(serialized: Uint8Array, name: String): Unit = js.native
  def pack(serialized: Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
  def setTypeUrl(value: String): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Uint8Array): Unit = js.native
  def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ Uint8Array, T], name: String): T | Null = js.native
}

