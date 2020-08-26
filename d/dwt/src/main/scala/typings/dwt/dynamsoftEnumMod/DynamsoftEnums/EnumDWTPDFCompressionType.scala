package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTPDFCompressionType extends js.Object

/** PDF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PDFCompressionType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPDFCompressionType with Double] = js.native
  /* 0 */ @js.native
  object PDF_AUTO extends TopLevel[PDF_AUTO with Double]
  
  /* 1 */ @js.native
  object PDF_FAX3 extends TopLevel[PDF_FAX3 with Double]
  
  /* 2 */ @js.native
  object PDF_FAX4 extends TopLevel[PDF_FAX4 with Double]
  
  /* 5 */ @js.native
  object PDF_JPEG extends TopLevel[PDF_JPEG with Double]
  
  /* 3 */ @js.native
  object PDF_LZW extends TopLevel[PDF_LZW with Double]
  
  /* 4 */ @js.native
  object PDF_RLE extends TopLevel[PDF_RLE with Double]
  
}

