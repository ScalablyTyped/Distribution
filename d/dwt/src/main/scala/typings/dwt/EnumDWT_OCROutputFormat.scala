package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCROutputFormat extends js.Object

@JSGlobal("EnumDWT_OCROutputFormat")
@js.native
object EnumDWT_OCROutputFormat extends js.Object {
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT extends EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT_PDFX extends EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT extends EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT_PDFX extends EnumDWT_OCROutputFormat
  
  @js.native
  sealed trait OCROF_TEXT extends EnumDWT_OCROutputFormat
  
  /* 2 */ val OCROF_PDFIMAGEOVERTEXT: typings.dwt.EnumDWT_OCROutputFormat.OCROF_PDFIMAGEOVERTEXT with Double = js.native
  /* 4 */ val OCROF_PDFIMAGEOVERTEXT_PDFX: typings.dwt.EnumDWT_OCROutputFormat.OCROF_PDFIMAGEOVERTEXT_PDFX with Double = js.native
  /* 1 */ val OCROF_PDFPLAINTEXT: typings.dwt.EnumDWT_OCROutputFormat.OCROF_PDFPLAINTEXT with Double = js.native
  /* 3 */ val OCROF_PDFPLAINTEXT_PDFX: typings.dwt.EnumDWT_OCROutputFormat.OCROF_PDFPLAINTEXT_PDFX with Double = js.native
  /* 0 */ val OCROF_TEXT: typings.dwt.EnumDWT_OCROutputFormat.OCROF_TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCROutputFormat with Double] = js.native
}

