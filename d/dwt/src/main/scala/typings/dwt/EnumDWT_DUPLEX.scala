package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_DUPLEX extends js.Object

/** ICAP_DUPLEX values. */
@JSGlobal("EnumDWT_DUPLEX")
@js.native
object EnumDWT_DUPLEX extends js.Object {
  @js.native
  sealed trait TWDX_1PASSDUPLEX extends EnumDWT_DUPLEX
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX extends EnumDWT_DUPLEX
  
  @js.native
  sealed trait TWDX_NONE extends EnumDWT_DUPLEX
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_DUPLEX with Double] = js.native
  /* 1 */ @js.native
  object TWDX_1PASSDUPLEX extends TopLevel[TWDX_1PASSDUPLEX with Double]
  
  /* 2 */ @js.native
  object TWDX_2PASSDUPLEX extends TopLevel[TWDX_2PASSDUPLEX with Double]
  
  /* 0 */ @js.native
  object TWDX_NONE extends TopLevel[TWDX_NONE with Double]
  
}

