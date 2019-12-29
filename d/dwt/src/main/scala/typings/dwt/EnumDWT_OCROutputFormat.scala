package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCROutputFormat with Double] = js.native
  /* 2 */ @js.native
  object OCROF_PDFIMAGEOVERTEXT extends TopLevel[OCROF_PDFIMAGEOVERTEXT with Double]
  
  /* 4 */ @js.native
  object OCROF_PDFIMAGEOVERTEXT_PDFX extends TopLevel[OCROF_PDFIMAGEOVERTEXT_PDFX with Double]
  
  /* 1 */ @js.native
  object OCROF_PDFPLAINTEXT extends TopLevel[OCROF_PDFPLAINTEXT with Double]
  
  /* 3 */ @js.native
  object OCROF_PDFPLAINTEXT_PDFX extends TopLevel[OCROF_PDFPLAINTEXT_PDFX with Double]
  
  /* 0 */ @js.native
  object OCROF_TEXT extends TopLevel[OCROF_TEXT with Double]
  
}

