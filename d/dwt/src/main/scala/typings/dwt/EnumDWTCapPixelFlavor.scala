package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapPixelFlavor extends js.Object

/** ICAP_PIXELFLAVOR values. */
@JSGlobal("EnumDWT_CapPixelFlavor")
@js.native
object EnumDWTCapPixelFlavor extends js.Object {
  /** Zero pixel represents darkest shade. zero pixel represents darkest shade   */
  @js.native
  sealed trait TWPF_CHOCOLATE extends EnumDWTCapPixelFlavor
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA extends EnumDWTCapPixelFlavor
  
}

