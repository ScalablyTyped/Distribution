package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCROutputFormat extends StObject
/** OCR Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCROutputFormat")
@js.native
object EnumDWTOCROutputFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCROutputFormat with Double] = js.native
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT extends EnumDWTOCROutputFormat
  /* 2 */ val OCROF_PDFIMAGEOVERTEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat.OCROF_PDFIMAGEOVERTEXT with Double = js.native
  
  @js.native
  sealed trait OCROF_PDFIMAGEOVERTEXT_PDFX extends EnumDWTOCROutputFormat
  /* 4 */ val OCROF_PDFIMAGEOVERTEXT_PDFX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat.OCROF_PDFIMAGEOVERTEXT_PDFX with Double = js.native
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT extends EnumDWTOCROutputFormat
  /* 1 */ val OCROF_PDFPLAINTEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat.OCROF_PDFPLAINTEXT with Double = js.native
  
  @js.native
  sealed trait OCROF_PDFPLAINTEXT_PDFX extends EnumDWTOCROutputFormat
  /* 3 */ val OCROF_PDFPLAINTEXT_PDFX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat.OCROF_PDFPLAINTEXT_PDFX with Double = js.native
  
  @js.native
  sealed trait OCROF_TEXT extends EnumDWTOCROutputFormat
  /* 0 */ val OCROF_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat.OCROF_TEXT with Double = js.native
}
