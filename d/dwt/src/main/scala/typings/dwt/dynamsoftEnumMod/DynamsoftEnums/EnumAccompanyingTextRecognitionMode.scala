package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumAccompanyingTextRecognitionMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumAccompanyingTextRecognitionMode")
@js.native
object EnumAccompanyingTextRecognitionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumAccompanyingTextRecognitionMode with Double] = js.native
  
  @js.native
  sealed trait ATRM_GENERAL extends EnumAccompanyingTextRecognitionMode
  /* 1 */ @js.native
  object ATRM_GENERAL extends TopLevel[ATRM_GENERAL with Double]
  
  @js.native
  sealed trait ATRM_SKIP extends EnumAccompanyingTextRecognitionMode
  /* 0 */ @js.native
  object ATRM_SKIP extends TopLevel[ATRM_SKIP with Double]
}
