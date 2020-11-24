package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPixelFlavor extends js.Object
/** ICAP_PIXELFLAVOR values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPixelFlavor")
@js.native
object EnumDWTCapPixelFlavor extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPixelFlavor with Double] = js.native
  
  /** Zero pixel represents darkest shade. zero pixel represents darkest shade   */
  @js.native
  sealed trait TWPF_CHOCOLATE extends EnumDWTCapPixelFlavor
  /* 0 */ @js.native
  object TWPF_CHOCOLATE extends TopLevel[TWPF_CHOCOLATE with Double]
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA extends EnumDWTCapPixelFlavor
  /* 1 */ @js.native
  object TWPF_VANILLA extends TopLevel[TWPF_VANILLA with Double]
}
