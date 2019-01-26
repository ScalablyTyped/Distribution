package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProOutputFormat extends js.Object

@JSGlobal("EnumDWT_OCRProOutputFormat")
@js.native
object EnumDWT_OCRProOutputFormat extends js.Object {
  @js.native
  sealed trait OCRPFT_IOTPDF
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_IOTPDF_MRC
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTCSV
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTF
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_TXTS
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  @js.native
  sealed trait OCRPFT_XML
    extends dwtLib.EnumDWT_OCRProOutputFormat
  
  /* "IOTPDF" */ val OCRPFT_IOTPDF: OCRPFT_IOTPDF with java.lang.String = js.native
  /* "IOTPDF_MRC" */ val OCRPFT_IOTPDF_MRC: OCRPFT_IOTPDF_MRC with java.lang.String = js.native
  /* "TXTCSV" */ val OCRPFT_TXTCSV: OCRPFT_TXTCSV with java.lang.String = js.native
  /* "TXTF" */ val OCRPFT_TXTF: OCRPFT_TXTF with java.lang.String = js.native
  /* "TXTS" */ val OCRPFT_TXTS: OCRPFT_TXTS with java.lang.String = js.native
  /* "XML" */ val OCRPFT_XML: OCRPFT_XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dwtLib.EnumDWT_OCRProOutputFormat with java.lang.String] = js.native
}

