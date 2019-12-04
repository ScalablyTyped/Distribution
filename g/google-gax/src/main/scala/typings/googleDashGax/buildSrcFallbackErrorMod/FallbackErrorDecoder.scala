package typings.googleDashGax.buildSrcFallbackErrorMod

import typings.node.Buffer
import typings.protobufjs.protobufjsMod.Message
import typings.protobufjs.protobufjsMod.Root
import typings.protobufjs.protobufjsMod.Type
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallbackError", "FallbackErrorDecoder")
@js.native
class FallbackErrorDecoder () extends js.Object {
  var anyType: Type = js.native
  var root: Root = js.native
  var statusType: Type = js.native
  def decodeProtobufAny(anyValue: ProtobufAny): Message[js.Object] = js.native
  def decodeRpcStatus(buffer: Buffer): DecodedRpcStatus = js.native
  def decodeRpcStatus(buffer: ArrayBuffer): DecodedRpcStatus = js.native
}

