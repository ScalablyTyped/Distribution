package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_AUTO
import typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_BALANCED
import typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_FASTEST
import typings.dwt.EnumDWT_OCRProRecognitionModule.OCRPM_MOSTACCURATE
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWT_OCRProRecognitionModule with String] = js.native
  /* "AUTO" */ @js.native
  object OCRPM_AUTO extends TopLevel[OCRPM_AUTO with String]
  
  /* "BALANCED" */ @js.native
  object OCRPM_BALANCED extends TopLevel[OCRPM_BALANCED with String]
  
  /* "FASTEST" */ @js.native
  object OCRPM_FASTEST extends TopLevel[OCRPM_FASTEST with String]
  
  /* "MOSTACCURATE" */ @js.native
  object OCRPM_MOSTACCURATE extends TopLevel[OCRPM_MOSTACCURATE with String]
  
}

