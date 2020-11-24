package typings.flatbuffers.mod.global.flatbuffers

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Encoding extends js.Object
@JSGlobal("flatbuffers.Encoding")
@js.native
object Encoding extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
  
  @js.native
  sealed trait UTF16_STRING extends Encoding
  /* 1 */ @js.native
  object UTF16_STRING extends TopLevel[UTF16_STRING with Double]
  
  @js.native
  sealed trait UTF8_BYTES extends Encoding
  /* 0 */ @js.native
  object UTF8_BYTES extends TopLevel[UTF8_BYTES with Double]
}
