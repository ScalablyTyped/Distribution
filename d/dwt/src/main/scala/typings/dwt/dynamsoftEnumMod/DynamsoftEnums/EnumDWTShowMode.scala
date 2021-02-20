package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTShowMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ShowMode")
@js.native
object EnumDWTShowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTShowMode with Double] = js.native
  
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE extends EnumDWTShowMode
  /* 0 */ val SW_ACTIVE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_ACTIVE with Double = js.native
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE extends EnumDWTShowMode
  /* 3 */ val SW_CLOSE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_CLOSE with Double = js.native
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE extends EnumDWTShowMode
  /* 4 */ val SW_IFLIVE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_IFLIVE with Double = js.native
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX extends EnumDWTShowMode
  /* 1 */ val SW_MAX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_MAX with Double = js.native
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN extends EnumDWTShowMode
  /* 2 */ val SW_MIN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_MIN with Double = js.native
}
