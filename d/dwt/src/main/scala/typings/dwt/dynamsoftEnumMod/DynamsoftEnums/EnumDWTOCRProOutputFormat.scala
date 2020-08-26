package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTOCRProOutputFormat extends js.Object

/** OCRPro Output Format */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProOutputFormat")
@js.native
object EnumDWTOCRProOutputFormat extends js.Object {
  @js.native
  sealed trait OCRPFT_IOTPDF extends EnumDWTOCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_IOTPDF_MRC extends EnumDWTOCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTCSV extends EnumDWTOCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTF extends EnumDWTOCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTS extends EnumDWTOCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_XML extends EnumDWTOCRProOutputFormat
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWTOCRProOutputFormat with String] = js.native
  /* "IOTPDF" */ @js.native
  object OCRPFT_IOTPDF extends TopLevel[OCRPFT_IOTPDF with String]
  
  /* "IOTPDF_MRC" */ @js.native
  object OCRPFT_IOTPDF_MRC extends TopLevel[OCRPFT_IOTPDF_MRC with String]
  
  /* "TXTCSV" */ @js.native
  object OCRPFT_TXTCSV extends TopLevel[OCRPFT_TXTCSV with String]
  
  /* "TXTF" */ @js.native
  object OCRPFT_TXTF extends TopLevel[OCRPFT_TXTF with String]
  
  /* "TXTS" */ @js.native
  object OCRPFT_TXTS extends TopLevel[OCRPFT_TXTS with String]
  
  /* "XML" */ @js.native
  object OCRPFT_XML extends TopLevel[OCRPFT_XML with String]
  
}

