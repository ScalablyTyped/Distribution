package typings.googleProtobuf.wrappersPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue_ () extends Message {
  
  def getValue(): Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): Uint8Array = js.native
  
  def setValue(value: String): BytesValue = js.native
  def setValue(value: Uint8Array): BytesValue = js.native
}
