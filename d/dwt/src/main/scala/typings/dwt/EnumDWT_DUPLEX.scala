package typings.dwt

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
  
  /* 1 */ val TWDX_1PASSDUPLEX: typings.dwt.EnumDWT_DUPLEX.TWDX_1PASSDUPLEX with Double = js.native
  /* 2 */ val TWDX_2PASSDUPLEX: typings.dwt.EnumDWT_DUPLEX.TWDX_2PASSDUPLEX with Double = js.native
  /* 0 */ val TWDX_NONE: typings.dwt.EnumDWT_DUPLEX.TWDX_NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_DUPLEX with Double] = js.native
}

