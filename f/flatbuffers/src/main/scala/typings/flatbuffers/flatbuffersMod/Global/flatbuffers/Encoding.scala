package typings.flatbuffers.flatbuffersMod.Global.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Encoding extends js.Object

@JSGlobal("flatbuffers.Encoding")
@js.native
object Encoding extends js.Object {
  @js.native
  sealed trait UTF16_STRING extends Encoding
  
  @js.native
  sealed trait UTF8_BYTES extends Encoding
  
  /* 1 */ val UTF16_STRING: typings.flatbuffers.flatbuffersMod.Global.flatbuffers.Encoding.UTF16_STRING with Double = js.native
  /* 0 */ val UTF8_BYTES: typings.flatbuffers.flatbuffersMod.Global.flatbuffers.Encoding.UTF8_BYTES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
}

