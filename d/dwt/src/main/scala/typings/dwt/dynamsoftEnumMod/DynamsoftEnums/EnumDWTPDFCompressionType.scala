package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPDFCompressionType extends js.Object
/** PDF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PDFCompressionType")
@js.native
object EnumDWTPDFCompressionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPDFCompressionType with Double] = js.native
  
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO extends EnumDWTPDFCompressionType
  /* 0 */ @js.native
  object PDF_AUTO extends TopLevel[PDF_AUTO with Double]
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3 extends EnumDWTPDFCompressionType
  /* 1 */ @js.native
  object PDF_FAX3 extends TopLevel[PDF_FAX3 with Double]
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4 extends EnumDWTPDFCompressionType
  /* 2 */ @js.native
  object PDF_FAX4 extends TopLevel[PDF_FAX4 with Double]
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG extends EnumDWTPDFCompressionType
  /* 5 */ @js.native
  object PDF_JPEG extends TopLevel[PDF_JPEG with Double]
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW extends EnumDWTPDFCompressionType
  /* 3 */ @js.native
  object PDF_LZW extends TopLevel[PDF_LZW with Double]
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE extends EnumDWTPDFCompressionType
  /* 4 */ @js.native
  object PDF_RLE extends TopLevel[PDF_RLE with Double]
}
