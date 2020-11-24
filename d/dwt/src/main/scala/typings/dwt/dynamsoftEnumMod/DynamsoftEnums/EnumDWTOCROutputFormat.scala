package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCROutputFormat extends js.Object
/** OCR Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCROutputFormat")
@js.native
object EnumDWTOCROutputFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCROutputFormat with Double] = js.native
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT extends EnumDWTOCROutputFormat
  /* 2 */ @js.native
  object OCROF_PDFIMAGEOVERTEXT extends TopLevel[OCROF_PDFIMAGEOVERTEXT with Double]
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT_PDFX extends EnumDWTOCROutputFormat
  /* 4 */ @js.native
  object OCROF_PDFIMAGEOVERTEXT_PDFX extends TopLevel[OCROF_PDFIMAGEOVERTEXT_PDFX with Double]
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT extends EnumDWTOCROutputFormat
  /* 1 */ @js.native
  object OCROF_PDFPLAINTEXT extends TopLevel[OCROF_PDFPLAINTEXT with Double]
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT_PDFX extends EnumDWTOCROutputFormat
  /* 3 */ @js.native
  object OCROF_PDFPLAINTEXT_PDFX extends TopLevel[OCROF_PDFPLAINTEXT_PDFX with Double]
  
  @js.native
  sealed trait OCROF_TEXT extends EnumDWTOCROutputFormat
  /* 0 */ @js.native
  object OCROF_TEXT extends TopLevel[OCROF_TEXT with Double]
}
