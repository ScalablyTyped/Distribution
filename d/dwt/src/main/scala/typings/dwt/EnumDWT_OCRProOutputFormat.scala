package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProOutputFormat extends js.Object

@JSGlobal("EnumDWT_OCRProOutputFormat")
@js.native
object EnumDWT_OCRProOutputFormat extends js.Object {
  @js.native
  sealed trait OCRPFT_IOTPDF extends EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_IOTPDF_MRC extends EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTCSV extends EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTF extends EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTS extends EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_XML extends EnumDWT_OCRProOutputFormat
  
  /* "IOTPDF" */ val OCRPFT_IOTPDF: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_IOTPDF with String = js.native
  /* "IOTPDF_MRC" */ val OCRPFT_IOTPDF_MRC: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_IOTPDF_MRC with String = js.native
  /* "TXTCSV" */ val OCRPFT_TXTCSV: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_TXTCSV with String = js.native
  /* "TXTF" */ val OCRPFT_TXTF: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_TXTF with String = js.native
  /* "TXTS" */ val OCRPFT_TXTS: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_TXTS with String = js.native
  /* "XML" */ val OCRPFT_XML: typings.dwt.EnumDWT_OCRProOutputFormat.OCRPFT_XML with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumDWT_OCRProOutputFormat with String] = js.native
}

