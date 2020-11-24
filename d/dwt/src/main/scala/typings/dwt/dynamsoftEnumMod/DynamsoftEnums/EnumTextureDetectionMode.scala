package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextureDetectionMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextureDetectionMode")
@js.native
object EnumTextureDetectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextureDetectionMode with Double] = js.native
  
  @js.native
  sealed trait TDM_AUTO extends EnumTextureDetectionMode
  /* 1 */ @js.native
  object TDM_AUTO extends TopLevel[TDM_AUTO with Double]
  
  @js.native
  sealed trait TDM_GENERAL_WIDTH_CONCENTRATION extends EnumTextureDetectionMode
  /* 2 */ @js.native
  object TDM_GENERAL_WIDTH_CONCENTRATION extends TopLevel[TDM_GENERAL_WIDTH_CONCENTRATION with Double]
  
  @js.native
  sealed trait TDM_SKIP extends EnumTextureDetectionMode
  /* 0 */ @js.native
  object TDM_SKIP extends TopLevel[TDM_SKIP with Double]
}
