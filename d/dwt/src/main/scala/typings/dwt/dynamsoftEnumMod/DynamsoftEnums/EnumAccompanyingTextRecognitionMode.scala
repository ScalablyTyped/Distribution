package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumAccompanyingTextRecognitionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumAccompanyingTextRecognitionMode")
@js.native
object EnumAccompanyingTextRecognitionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumAccompanyingTextRecognitionMode with Double] = js.native
  
  @js.native
  sealed trait ATRM_GENERAL extends EnumAccompanyingTextRecognitionMode
  /* 1 */ val ATRM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumAccompanyingTextRecognitionMode.ATRM_GENERAL with Double = js.native
  
  @js.native
  sealed trait ATRM_SKIP extends EnumAccompanyingTextRecognitionMode
  /* 0 */ val ATRM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumAccompanyingTextRecognitionMode.ATRM_SKIP with Double = js.native
}
