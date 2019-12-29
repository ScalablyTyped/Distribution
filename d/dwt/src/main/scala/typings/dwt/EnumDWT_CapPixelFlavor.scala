package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPixelFlavor with Double] = js.native
  /* 0 */ @js.native
  object TWPF_CHOCOLATE extends TopLevel[TWPF_CHOCOLATE with Double]
  
  /* 1 */ @js.native
  object TWPF_VANILLA extends TopLevel[TWPF_VANILLA with Double]
  
}

