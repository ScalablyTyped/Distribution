package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapPixelFlavor extends js.Object

/** ICAP_PIXELFLAVOR values. */
@JSGlobal("EnumDWT_CapPixelFlavor")
@js.native
object EnumDWT_CapPixelFlavor extends js.Object {
  /** Zero pixel represents darkest shade. zero pixel represents darkest shade   */
  @js.native
  sealed trait TWPF_CHOCOLATE
    extends dwtLib.EnumDWT_CapPixelFlavor
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA
    extends dwtLib.EnumDWT_CapPixelFlavor
  
  /* 0 */ val TWPF_CHOCOLATE: TWPF_CHOCOLATE with scala.Double = js.native
  /* 1 */ val TWPF_VANILLA: TWPF_VANILLA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapPixelFlavor with scala.Double] = js.native
}

