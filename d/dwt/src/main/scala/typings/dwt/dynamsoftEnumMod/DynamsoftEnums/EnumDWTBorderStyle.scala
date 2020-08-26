package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTBorderStyle extends js.Object

/** Border Styles */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_BorderStyle")
@js.native
object EnumDWTBorderStyle extends js.Object {
  /** No border. */
  @js.native
  sealed trait TWBS_NONE extends EnumDWTBorderStyle
  
  /** 3D border.   */
  @js.native
  sealed trait TWBS_SINGLE3D extends EnumDWTBorderStyle
  
  /** Flat border. */
  @js.native
  sealed trait TWBS_SINGLEFLAT extends EnumDWTBorderStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTBorderStyle with Double] = js.native
  /* 0 */ @js.native
  object TWBS_NONE extends TopLevel[TWBS_NONE with Double]
  
  /* 2 */ @js.native
  object TWBS_SINGLE3D extends TopLevel[TWBS_SINGLE3D with Double]
  
  /* 1 */ @js.native
  object TWBS_SINGLEFLAT extends TopLevel[TWBS_SINGLEFLAT with Double]
  
}

