package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFeederAlignment extends StObject
/** CAP_FEEDERALIGNMENT values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederAlignment")
@js.native
object EnumDWTCapFeederAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederAlignment & Double] = js.native
  
  /**
    * The alignment is centered. This means that the paper will be fed in the middle of
    * the ICAP_PHYSICALWIDTH of the device. If this is set, then the Application should
    * calculate any frames with a left offset of zero.
    */
  @js.native
  sealed trait TWFA_CENTER
    extends StObject
       with EnumDWTCapFeederAlignment
  /* 2 */ val TWFA_CENTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederAlignment.TWFA_CENTER & Double = js.native
  
  /** The alignment is to the left. */
  @js.native
  sealed trait TWFA_LEFT
    extends StObject
       with EnumDWTCapFeederAlignment
  /* 1 */ val TWFA_LEFT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederAlignment.TWFA_LEFT & Double = js.native
  
  /** The alignment is free-floating. Applications should assume that the origin for frames is on the left. */
  @js.native
  sealed trait TWFA_NONE
    extends StObject
       with EnumDWTCapFeederAlignment
  /* 0 */ val TWFA_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederAlignment.TWFA_NONE & Double = js.native
  
  /** The alignment is to the right. */
  @js.native
  sealed trait TWFA_RIGHT
    extends StObject
       with EnumDWTCapFeederAlignment
  /* 3 */ val TWFA_RIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederAlignment.TWFA_RIGHT & Double = js.native
}
