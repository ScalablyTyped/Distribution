package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTPDFCompressionType extends js.Object

/** PDF file compression type. */
@JSGlobal("EnumDWT_PDFCompressionType")
@js.native
object EnumDWTPDFCompressionType extends js.Object {
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO extends EnumDWTPDFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3 extends EnumDWTPDFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4 extends EnumDWTPDFCompressionType
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG extends EnumDWTPDFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW extends EnumDWTPDFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE extends EnumDWTPDFCompressionType
  
}

