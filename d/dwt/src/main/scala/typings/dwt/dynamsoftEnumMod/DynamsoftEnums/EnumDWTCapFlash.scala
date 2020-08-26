package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFlash extends js.Object

/** ICAP_FLASHUSED2 values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlash")
@js.native
object EnumDWTCapFlash extends js.Object {
  @js.native
  sealed trait TWFL_AUTO extends EnumDWTCapFlash
  
  @js.native
  sealed trait TWFL_NONE extends EnumDWTCapFlash
  
  @js.native
  sealed trait TWFL_OFF extends EnumDWTCapFlash
  
  @js.native
  sealed trait TWFL_ON extends EnumDWTCapFlash
  
  @js.native
  sealed trait TWFL_REDEYE extends EnumDWTCapFlash
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlash with Double] = js.native
  /* 3 */ @js.native
  object TWFL_AUTO extends TopLevel[TWFL_AUTO with Double]
  
  /* 0 */ @js.native
  object TWFL_NONE extends TopLevel[TWFL_NONE with Double]
  
  /* 1 */ @js.native
  object TWFL_OFF extends TopLevel[TWFL_OFF with Double]
  
  /* 2 */ @js.native
  object TWFL_ON extends TopLevel[TWFL_ON with Double]
  
  /* 4 */ @js.native
  object TWFL_REDEYE extends TopLevel[TWFL_REDEYE with Double]
  
}

