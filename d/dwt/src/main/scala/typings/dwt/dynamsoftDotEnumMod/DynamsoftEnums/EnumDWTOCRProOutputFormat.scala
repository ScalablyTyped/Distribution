package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProOutputFormat extends StObject
/** OCRPro Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProOutputFormat")
@js.native
object EnumDWTOCRProOutputFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWTOCRProOutputFormat & String] = js.native
  
  @js.native
  sealed trait OCRPFT_IOTPDF
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "IOTPDF" */ val OCRPFT_IOTPDF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_IOTPDF & String = js.native
  
  @js.native
  sealed trait OCRPFT_IOTPDF_MRC
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "IOTPDF_MRC" */ val OCRPFT_IOTPDF_MRC: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_IOTPDF_MRC & String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTCSV
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "TXTCSV" */ val OCRPFT_TXTCSV: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTCSV & String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTF
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "TXTF" */ val OCRPFT_TXTF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTF & String = js.native
  
  @js.native
  sealed trait OCRPFT_TXTS
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "TXTS" */ val OCRPFT_TXTS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_TXTS & String = js.native
  
  @js.native
  sealed trait OCRPFT_XML
    extends StObject
       with EnumDWTOCRProOutputFormat
  /* "XML" */ val OCRPFT_XML: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat.OCRPFT_XML & String = js.native
}
