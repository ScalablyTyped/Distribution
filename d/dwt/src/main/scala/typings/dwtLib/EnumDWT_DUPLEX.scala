package typings
package dwtLib

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
  sealed trait TWDX_1PASSDUPLEX
    extends dwtLib.EnumDWT_DUPLEX
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX
    extends dwtLib.EnumDWT_DUPLEX
  
  @js.native
  sealed trait TWDX_NONE
    extends dwtLib.EnumDWT_DUPLEX
  
  /* 1 */ val TWDX_1PASSDUPLEX: TWDX_1PASSDUPLEX with scala.Double = js.native
  /* 2 */ val TWDX_2PASSDUPLEX: TWDX_2PASSDUPLEX with scala.Double = js.native
  /* 0 */ val TWDX_NONE: TWDX_NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_DUPLEX with scala.Double] = js.native
}

