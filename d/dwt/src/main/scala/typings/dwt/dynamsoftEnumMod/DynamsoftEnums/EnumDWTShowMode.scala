package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTShowMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ShowMode")
@js.native
object EnumDWTShowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTShowMode & Double] = js.native
  
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE
    extends StObject
       with EnumDWTShowMode
  /* 0 */ val SW_ACTIVE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_ACTIVE & Double = js.native
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE
    extends StObject
       with EnumDWTShowMode
  /* 3 */ val SW_CLOSE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_CLOSE & Double = js.native
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE
    extends StObject
       with EnumDWTShowMode
  /* 4 */ val SW_IFLIVE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_IFLIVE & Double = js.native
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX
    extends StObject
       with EnumDWTShowMode
  /* 1 */ val SW_MAX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_MAX & Double = js.native
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN
    extends StObject
       with EnumDWTShowMode
  /* 2 */ val SW_MIN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTShowMode.SW_MIN & Double = js.native
}
