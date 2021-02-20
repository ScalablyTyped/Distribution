package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProOutputFormat extends StObject
/** OCRPro Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProOutputFormat")
@js.native
object EnumDWTOCRProOutputFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWTOCRProOutputFormat with String] = js.native
  
  @js.native
  sealed trait OCRPFT_IOTPDF extends EnumDWTOCRProOutputFormat
  /* "IOTPDF" */ val OCRPFT_IOTPDF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_IOTPDF with String = js.native
  
  @js.native
  sealed trait OCRPFT_IOTPDF_MRC extends EnumDWTOCRProOutputFormat
  /* "IOTPDF_MRC" */ val OCRPFT_IOTPDF_MRC: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_IOTPDF_MRC with String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTCSV extends EnumDWTOCRProOutputFormat
  /* "TXTCSV" */ val OCRPFT_TXTCSV: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTCSV with String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTF extends EnumDWTOCRProOutputFormat
  /* "TXTF" */ val OCRPFT_TXTF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTF with String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTS extends EnumDWTOCRProOutputFormat
  /* "TXTS" */ val OCRPFT_TXTS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTS with String = js.native
  
  @js.native
  sealed trait OCRPFT_XML extends EnumDWTOCRProOutputFormat
  /* "XML" */ val OCRPFT_XML: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_XML with String = js.native
}
