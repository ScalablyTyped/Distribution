package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextAssistedCorrectionMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextAssistedCorrectionMode")
@js.native
object EnumTextAssistedCorrectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextAssistedCorrectionMode with Double] = js.native
  
  @js.native
  sealed trait TACM_AUTO extends EnumTextAssistedCorrectionMode
  /* 1 */ @js.native
  object TACM_AUTO extends TopLevel[TACM_AUTO with Double]
  
  @js.native
  sealed trait TACM_SKIP extends EnumTextAssistedCorrectionMode
  /* 0 */ @js.native
  object TACM_SKIP extends TopLevel[TACM_SKIP with Double]
  
  @js.native
  sealed trait TACM_VERIFYING extends EnumTextAssistedCorrectionMode
  /* 2 */ @js.native
  object TACM_VERIFYING extends TopLevel[TACM_VERIFYING with Double]
  
  @js.native
  sealed trait TACM_VERIFYING_PATCHING extends EnumTextAssistedCorrectionMode
  /* 4 */ @js.native
  object TACM_VERIFYING_PATCHING extends TopLevel[TACM_VERIFYING_PATCHING with Double]
}
