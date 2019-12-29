package typings.flatbuffers.flatbuffersMod._Global_.flatbuffers

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
  /* 1 */ @js.native
  object UTF16_STRING extends TopLevel[UTF16_STRING with Double]
  
  /* 0 */ @js.native
  object UTF8_BYTES extends TopLevel[UTF8_BYTES with Double]
  
}

