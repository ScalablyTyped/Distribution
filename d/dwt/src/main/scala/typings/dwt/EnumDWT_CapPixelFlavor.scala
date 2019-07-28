package typings.dwt

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
  sealed trait TWPF_CHOCOLATE extends EnumDWT_CapPixelFlavor
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA extends EnumDWT_CapPixelFlavor
  
  /* 0 */ val TWPF_CHOCOLATE: typings.dwt.EnumDWT_CapPixelFlavor.TWPF_CHOCOLATE with Double = js.native
  /* 1 */ val TWPF_VANILLA: typings.dwt.EnumDWT_CapPixelFlavor.TWPF_VANILLA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPixelFlavor with Double] = js.native
}

