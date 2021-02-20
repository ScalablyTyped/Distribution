package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProRecognitionModule extends StObject
/** OCRPro Reconnition module */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProRecognitionModule")
@js.native
object EnumDWTOCRProRecognitionModule extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWTOCRProRecognitionModule with String] = js.native
  
  @js.native
  sealed trait OCRPM_AUTO extends EnumDWTOCRProRecognitionModule
  /* "AUTO" */ val OCRPM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule.OCRPM_AUTO with String = js.native
  
  @js.native
  sealed trait OCRPM_BALANCED extends EnumDWTOCRProRecognitionModule
  /* "BALANCED" */ val OCRPM_BALANCED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule.OCRPM_BALANCED with String = js.native
  
  @js.native
  sealed trait OCRPM_FASTEST extends EnumDWTOCRProRecognitionModule
  /* "FASTEST" */ val OCRPM_FASTEST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule.OCRPM_FASTEST with String = js.native
  
  @js.native
  sealed trait OCRPM_MOSTACCURATE extends EnumDWTOCRProRecognitionModule
  /* "MOSTACCURATE" */ val OCRPM_MOSTACCURATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule.OCRPM_MOSTACCURATE with String = js.native
}
