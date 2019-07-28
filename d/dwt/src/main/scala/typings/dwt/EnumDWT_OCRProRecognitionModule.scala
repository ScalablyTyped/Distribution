package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProRecognitionModule extends js.Object

@JSGlobal("EnumDWT_OCRProRecognitionModule")
@js.native
object EnumDWT_OCRProRecognitionModule extends js.Object {
  @js.native
  sealed trait OCRPM_AUTO extends EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_BALANCED extends EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_FASTEST extends EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_MOSTACCURATE extends EnumDWT_OCRProRecognitionModule
  
  /* "AUTO" */ val OCRPM_AUTO: typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_AUTO with String = js.native
  /* "BALANCED" */ val OCRPM_BALANCED: typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_BALANCED with String = js.native
  /* "FASTEST" */ val OCRPM_FASTEST: typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_FASTEST with String = js.native
  /* "MOSTACCURATE" */ val OCRPM_MOSTACCURATE: typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_MOSTACCURATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWT_OCRProRecognitionModule with String] = js.native
}

