package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapBitdepthReduction extends StObject
/** ICAP_BITDEPTHREDUCTION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitdepthReduction")
@js.native
object EnumDWTCapBitdepthReduction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitdepthReduction with Double] = js.native
  
  @js.native
  sealed trait TWBR_CUSTHALFTONE extends EnumDWTCapBitdepthReduction
  /* 2 */ val TWBR_CUSTHALFTONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_CUSTHALFTONE with Double = js.native
  
  @js.native
  sealed trait TWBR_DIFFUSION extends EnumDWTCapBitdepthReduction
  /* 3 */ val TWBR_DIFFUSION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_DIFFUSION with Double = js.native
  
  @js.native
  sealed trait TWBR_HALFTONE extends EnumDWTCapBitdepthReduction
  /* 1 */ val TWBR_HALFTONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_HALFTONE with Double = js.native
  
  @js.native
  sealed trait TWBR_THRESHOLD extends EnumDWTCapBitdepthReduction
  /* 0 */ val TWBR_THRESHOLD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_THRESHOLD with Double = js.native
}
