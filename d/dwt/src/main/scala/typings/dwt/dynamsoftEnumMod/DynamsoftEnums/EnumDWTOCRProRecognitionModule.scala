package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProRecognitionModule extends js.Object
/** OCRPro Reconnition module */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProRecognitionModule")
@js.native
object EnumDWTOCRProRecognitionModule extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWTOCRProRecognitionModule with String] = js.native
  
  @js.native
  sealed trait OCRPM_AUTO extends EnumDWTOCRProRecognitionModule
  /* "AUTO" */ @js.native
  object OCRPM_AUTO extends TopLevel[OCRPM_AUTO with String]
  
  @js.native
  sealed trait OCRPM_BALANCED extends EnumDWTOCRProRecognitionModule
  /* "BALANCED" */ @js.native
  object OCRPM_BALANCED extends TopLevel[OCRPM_BALANCED with String]
  
  @js.native
  sealed trait OCRPM_FASTEST extends EnumDWTOCRProRecognitionModule
  /* "FASTEST" */ @js.native
  object OCRPM_FASTEST extends TopLevel[OCRPM_FASTEST with String]
  
  @js.native
  sealed trait OCRPM_MOSTACCURATE extends EnumDWTOCRProRecognitionModule
  /* "MOSTACCURATE" */ @js.native
  object OCRPM_MOSTACCURATE extends TopLevel[OCRPM_MOSTACCURATE with String]
}
