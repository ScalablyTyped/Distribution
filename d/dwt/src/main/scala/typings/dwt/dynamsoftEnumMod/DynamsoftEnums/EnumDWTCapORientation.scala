package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapORientation extends js.Object
/** ICAP_ORIENTATION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapORientation")
@js.native
object EnumDWTCapORientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapORientation with Double] = js.native
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTO extends EnumDWTCapORientation
  /* 4 */ @js.native
  object TWOR_AUTO extends TopLevel[TWOR_AUTO with Double]
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOPICTURE extends EnumDWTCapORientation
  /* 6 */ @js.native
  object TWOR_AUTOPICTURE extends TopLevel[TWOR_AUTOPICTURE with Double]
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOTEXT extends EnumDWTCapORientation
  /* 5 */ @js.native
  object TWOR_AUTOTEXT extends TopLevel[TWOR_AUTOTEXT with Double]
  
  @js.native
  sealed trait TWOR_LANDSCAPE extends EnumDWTCapORientation
  /* 3 */ @js.native
  object TWOR_LANDSCAPE extends TopLevel[TWOR_LANDSCAPE with Double]
  
  @js.native
  sealed trait TWOR_PORTRAIT extends EnumDWTCapORientation
  /* 0 */ @js.native
  object TWOR_PORTRAIT extends TopLevel[TWOR_PORTRAIT with Double]
  
  @js.native
  sealed trait TWOR_ROT0 extends EnumDWTCapORientation
  /* 0 */ @js.native
  object TWOR_ROT0 extends TopLevel[TWOR_ROT0 with Double]
  
  @js.native
  sealed trait TWOR_ROT180 extends EnumDWTCapORientation
  /* 2 */ @js.native
  object TWOR_ROT180 extends TopLevel[TWOR_ROT180 with Double]
  
  @js.native
  sealed trait TWOR_ROT270 extends EnumDWTCapORientation
  /* 3 */ @js.native
  object TWOR_ROT270 extends TopLevel[TWOR_ROT270 with Double]
  
  @js.native
  sealed trait TWOR_ROT90 extends EnumDWTCapORientation
  /* 1 */ @js.native
  object TWOR_ROT90 extends TopLevel[TWOR_ROT90 with Double]
}
