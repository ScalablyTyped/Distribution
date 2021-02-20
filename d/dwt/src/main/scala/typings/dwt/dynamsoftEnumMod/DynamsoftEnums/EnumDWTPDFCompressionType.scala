package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPDFCompressionType extends StObject
/** PDF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PDFCompressionType")
@js.native
object EnumDWTPDFCompressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPDFCompressionType with Double] = js.native
  
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO extends EnumDWTPDFCompressionType
  /* 0 */ val PDF_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_AUTO with Double = js.native
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3 extends EnumDWTPDFCompressionType
  /* 1 */ val PDF_FAX3: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_FAX3 with Double = js.native
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4 extends EnumDWTPDFCompressionType
  /* 2 */ val PDF_FAX4: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_FAX4 with Double = js.native
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG extends EnumDWTPDFCompressionType
  /* 5 */ val PDF_JPEG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_JPEG with Double = js.native
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW extends EnumDWTPDFCompressionType
  /* 3 */ val PDF_LZW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_LZW with Double = js.native
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE extends EnumDWTPDFCompressionType
  /* 4 */ val PDF_RLE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_RLE with Double = js.native
}
