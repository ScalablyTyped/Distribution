package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFeederAlignment extends js.Object

/** CAP_FEEDERALIGNMENT values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederAlignment")
@js.native
object EnumDWTCapFeederAlignment extends js.Object {
  /**
    * The alignment is centered. This means that the paper will be fed in the middle of
    * the ICAP_PHYSICALWIDTH of the device. If this is set, then the Application should
    * calculate any frames with a left offset of zero.
    */
  @js.native
  sealed trait TWFA_CENTER extends EnumDWTCapFeederAlignment
  
  /** The alignment is to the left. */
  @js.native
  sealed trait TWFA_LEFT extends EnumDWTCapFeederAlignment
  
  /** The alignment is free-floating. Applications should assume that the origin for frames is on the left. */
  @js.native
  sealed trait TWFA_NONE extends EnumDWTCapFeederAlignment
  
  /** The alignment is to the right. */
  @js.native
  sealed trait TWFA_RIGHT extends EnumDWTCapFeederAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederAlignment with Double] = js.native
  /* 2 */ @js.native
  object TWFA_CENTER extends TopLevel[TWFA_CENTER with Double]
  
  /* 1 */ @js.native
  object TWFA_LEFT extends TopLevel[TWFA_LEFT with Double]
  
  /* 0 */ @js.native
  object TWFA_NONE extends TopLevel[TWFA_NONE with Double]
  
  /* 3 */ @js.native
  object TWFA_RIGHT extends TopLevel[TWFA_RIGHT with Double]
  
}

