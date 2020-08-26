package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTOCROutputFormat extends js.Object

/** OCR Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCROutputFormat")
@js.native
object EnumDWTOCROutputFormat extends js.Object {
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT extends EnumDWTOCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT_PDFX extends EnumDWTOCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT extends EnumDWTOCROutputFormat
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT_PDFX extends EnumDWTOCROutputFormat
  
  @js.native
  sealed trait OCROF_TEXT extends EnumDWTOCROutputFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCROutputFormat with Double] = js.native
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

