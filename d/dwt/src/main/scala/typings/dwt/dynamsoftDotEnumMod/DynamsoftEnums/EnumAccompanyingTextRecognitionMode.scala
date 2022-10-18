package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumAccompanyingTextRecognitionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumAccompanyingTextRecognitionMode")
@js.native
object EnumAccompanyingTextRecognitionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumAccompanyingTextRecognitionMode & Double] = js.native
  
  @js.native
  sealed trait ATRM_GENERAL
    extends StObject
       with EnumAccompanyingTextRecognitionMode
  /* 1 */ val ATRM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumAccompanyingTextRecognitionMode.ATRM_GENERAL & Double = js.native
  
  @js.native
  sealed trait ATRM_SKIP
    extends StObject
       with EnumAccompanyingTextRecognitionMode
  /* 0 */ val ATRM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumAccompanyingTextRecognitionMode.ATRM_SKIP & Double = js.native
}
