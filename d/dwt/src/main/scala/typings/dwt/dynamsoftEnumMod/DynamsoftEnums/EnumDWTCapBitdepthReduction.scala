package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapBitdepthReduction extends StObject
/** ICAP_BITDEPTHREDUCTION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitdepthReduction")
@js.native
object EnumDWTCapBitdepthReduction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitdepthReduction & Double] = js.native
  
  @js.native
  sealed trait TWBR_CUSTHALFTONE
    extends StObject
       with EnumDWTCapBitdepthReduction
  /* 2 */ val TWBR_CUSTHALFTONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_CUSTHALFTONE & Double = js.native
  
  @js.native
  sealed trait TWBR_DIFFUSION
    extends StObject
       with EnumDWTCapBitdepthReduction
  /* 3 */ val TWBR_DIFFUSION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_DIFFUSION & Double = js.native
  
  @js.native
  sealed trait TWBR_HALFTONE
    extends StObject
       with EnumDWTCapBitdepthReduction
  /* 1 */ val TWBR_HALFTONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_HALFTONE & Double = js.native
  
  @js.native
  sealed trait TWBR_THRESHOLD
    extends StObject
       with EnumDWTCapBitdepthReduction
  /* 0 */ val TWBR_THRESHOLD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitdepthReduction.TWBR_THRESHOLD & Double = js.native
}
