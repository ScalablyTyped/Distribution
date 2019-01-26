package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProRecognitionModule extends js.Object

@JSGlobal("EnumDWT_OCRProRecognitionModule")
@js.native
object EnumDWT_OCRProRecognitionModule extends js.Object {
  @js.native
  sealed trait OCRPM_AUTO
    extends dwtLib.EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_BALANCED
    extends dwtLib.EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_FASTEST
    extends dwtLib.EnumDWT_OCRProRecognitionModule
  
  @js.native
  sealed trait OCRPM_MOSTACCURATE
    extends dwtLib.EnumDWT_OCRProRecognitionModule
  
  /* "AUTO" */ val OCRPM_AUTO: OCRPM_AUTO with java.lang.String = js.native
  /* "BALANCED" */ val OCRPM_BALANCED: OCRPM_BALANCED with java.lang.String = js.native
  /* "FASTEST" */ val OCRPM_FASTEST: OCRPM_FASTEST with java.lang.String = js.native
  /* "MOSTACCURATE" */ val OCRPM_MOSTACCURATE: OCRPM_MOSTACCURATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dwtLib.EnumDWT_OCRProRecognitionModule with java.lang.String] = js.native
}

