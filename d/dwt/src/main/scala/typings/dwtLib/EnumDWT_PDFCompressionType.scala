package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_PDFCompressionType extends js.Object

/** PDF file compression type. */
@JSGlobal("EnumDWT_PDFCompressionType")
@js.native
object EnumDWT_PDFCompressionType extends js.Object {
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE
    extends dwtLib.EnumDWT_PDFCompressionType
  
  /* 0 */ val PDF_AUTO: PDF_AUTO with scala.Double = js.native
  /* 1 */ val PDF_FAX3: PDF_FAX3 with scala.Double = js.native
  /* 2 */ val PDF_FAX4: PDF_FAX4 with scala.Double = js.native
  /* 5 */ val PDF_JPEG: PDF_JPEG with scala.Double = js.native
  /* 3 */ val PDF_LZW: PDF_LZW with scala.Double = js.native
  /* 4 */ val PDF_RLE: PDF_RLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_PDFCompressionType with scala.Double] = js.native
}

