package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextFilterMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextFilterMode")
@js.native
object EnumTextFilterMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextFilterMode with Double] = js.native
  
  @js.native
  sealed trait TFM_AUTO extends EnumTextFilterMode
  /* 1 */ @js.native
  object TFM_AUTO extends TopLevel[TFM_AUTO with Double]
  
  @js.native
  sealed trait TFM_GENERAL_CONTOUR extends EnumTextFilterMode
  /* 2 */ @js.native
  object TFM_GENERAL_CONTOUR extends TopLevel[TFM_GENERAL_CONTOUR with Double]
  
  @js.native
  sealed trait TFM_SKIP extends EnumTextFilterMode
  /* 0 */ @js.native
  object TFM_SKIP extends TopLevel[TFM_SKIP with Double]
}
