package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPixelFlavor extends StObject
/** ICAP_PIXELFLAVOR values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPixelFlavor")
@js.native
object EnumDWTCapPixelFlavor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPixelFlavor with Double] = js.native
  
  /** Zero pixel represents darkest shade. zero pixel represents darkest shade   */
  @js.native
  sealed trait TWPF_CHOCOLATE extends EnumDWTCapPixelFlavor
  /* 0 */ val TWPF_CHOCOLATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor.TWPF_CHOCOLATE with Double = js.native
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA extends EnumDWTCapPixelFlavor
  /* 1 */ val TWPF_VANILLA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor.TWPF_VANILLA with Double = js.native
}
