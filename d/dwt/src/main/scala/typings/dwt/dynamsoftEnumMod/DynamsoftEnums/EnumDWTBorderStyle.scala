package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTBorderStyle extends StObject
/** Border Styles */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_BorderStyle")
@js.native
object EnumDWTBorderStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTBorderStyle with Double] = js.native
  
  /** No border. */
  @js.native
  sealed trait TWBS_NONE extends EnumDWTBorderStyle
  /* 0 */ val TWBS_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTBorderStyle.TWBS_NONE with Double = js.native
  
  /** 3D border.   */
  @js.native
  sealed trait TWBS_SINGLE3D extends EnumDWTBorderStyle
  /* 2 */ val TWBS_SINGLE3D: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTBorderStyle.TWBS_SINGLE3D with Double = js.native
  
  /** Flat border. */
  @js.native
  sealed trait TWBS_SINGLEFLAT extends EnumDWTBorderStyle
  /* 1 */ val TWBS_SINGLEFLAT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTBorderStyle.TWBS_SINGLEFLAT with Double = js.native
}
