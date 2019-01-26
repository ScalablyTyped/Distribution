package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCROutputFormat extends js.Object

@JSGlobal("EnumDWT_OCROutputFormat")
@js.native
object EnumDWT_OCROutputFormat extends js.Object {
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT
    extends dwtLib.EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT_PDFX
    extends dwtLib.EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT
    extends dwtLib.EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT_PDFX
    extends dwtLib.EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_TEXT
    extends dwtLib.EnumDWT_OCROutputFormat
  
  /* 2 */ val OCROF_PDFIMAGEOVERTEXT: OCROF_PDFIMAGEOVERTEXT with scala.Double = js.native
  /* 4 */ val OCROF_PDFIMAGEOVERTEXT_PDFX: OCROF_PDFIMAGEOVERTEXT_PDFX with scala.Double = js.native
  /* 1 */ val OCROF_PDFPLAINTEXT: OCROF_PDFPLAINTEXT with scala.Double = js.native
  /* 3 */ val OCROF_PDFPLAINTEXT_PDFX: OCROF_PDFPLAINTEXT_PDFX with scala.Double = js.native
  /* 0 */ val OCROF_TEXT: OCROF_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_OCROutputFormat with scala.Double] = js.native
}

