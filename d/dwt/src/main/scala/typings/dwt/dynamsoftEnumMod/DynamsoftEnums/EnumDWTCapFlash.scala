package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFlash extends js.Object
/** ICAP_FLASHUSED2 values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlash")
@js.native
object EnumDWTCapFlash extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlash with Double] = js.native
  
  @js.native
  sealed trait TWFL_AUTO extends EnumDWTCapFlash
  /* 3 */ @js.native
  object TWFL_AUTO extends TopLevel[TWFL_AUTO with Double]
  
  @js.native
  sealed trait TWFL_NONE extends EnumDWTCapFlash
  /* 0 */ @js.native
  object TWFL_NONE extends TopLevel[TWFL_NONE with Double]
  
  @js.native
  sealed trait TWFL_OFF extends EnumDWTCapFlash
  /* 1 */ @js.native
  object TWFL_OFF extends TopLevel[TWFL_OFF with Double]
  
  @js.native
  sealed trait TWFL_ON extends EnumDWTCapFlash
  /* 2 */ @js.native
  object TWFL_ON extends TopLevel[TWFL_ON with Double]
  
  @js.native
  sealed trait TWFL_REDEYE extends EnumDWTCapFlash
  /* 4 */ @js.native
  object TWFL_REDEYE extends TopLevel[TWFL_REDEYE with Double]
}
