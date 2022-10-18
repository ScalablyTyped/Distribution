package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPixelFlavor extends StObject
/** ICAP_PIXELFLAVOR values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPixelFlavor")
@js.native
object EnumDWTCapPixelFlavor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPixelFlavor & Double] = js.native
  
  /** Zero pixel represents darkest shade. zero pixel represents darkest shade   */
  @js.native
  sealed trait TWPF_CHOCOLATE
    extends StObject
       with EnumDWTCapPixelFlavor
  /* 0 */ val TWPF_CHOCOLATE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor.TWPF_CHOCOLATE & Double = js.native
  
  /** Zero pixel represents lightest shade. zero pixel represents lightest shade  */
  @js.native
  sealed trait TWPF_VANILLA
    extends StObject
       with EnumDWTCapPixelFlavor
  /* 1 */ val TWPF_VANILLA: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor.TWPF_VANILLA & Double = js.native
}
