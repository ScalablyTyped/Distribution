package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTShowMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ShowMode")
@js.native
object EnumDWTShowMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTShowMode with Double] = js.native
  
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE extends EnumDWTShowMode
  /* 0 */ @js.native
  object SW_ACTIVE extends TopLevel[SW_ACTIVE with Double]
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE extends EnumDWTShowMode
  /* 3 */ @js.native
  object SW_CLOSE extends TopLevel[SW_CLOSE with Double]
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE extends EnumDWTShowMode
  /* 4 */ @js.native
  object SW_IFLIVE extends TopLevel[SW_IFLIVE with Double]
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX extends EnumDWTShowMode
  /* 1 */ @js.native
  object SW_MAX extends TopLevel[SW_MAX with Double]
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN extends EnumDWTShowMode
  /* 2 */ @js.native
  object SW_MIN extends TopLevel[SW_MIN with Double]
}
