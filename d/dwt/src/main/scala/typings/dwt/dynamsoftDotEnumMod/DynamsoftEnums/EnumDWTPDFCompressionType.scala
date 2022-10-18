package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPDFCompressionType extends StObject
/** PDF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PDFCompressionType")
@js.native
object EnumDWTPDFCompressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPDFCompressionType & Double] = js.native
  
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO
    extends StObject
       with EnumDWTPDFCompressionType
  /* 0 */ val PDF_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_AUTO & Double = js.native
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3
    extends StObject
       with EnumDWTPDFCompressionType
  /* 1 */ val PDF_FAX3: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_FAX3 & Double = js.native
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4
    extends StObject
       with EnumDWTPDFCompressionType
  /* 2 */ val PDF_FAX4: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_FAX4 & Double = js.native
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG
    extends StObject
       with EnumDWTPDFCompressionType
  /* 5 */ val PDF_JPEG: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_JPEG & Double = js.native
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW
    extends StObject
       with EnumDWTPDFCompressionType
  /* 3 */ val PDF_LZW: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_LZW & Double = js.native
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE
    extends StObject
       with EnumDWTPDFCompressionType
  /* 4 */ val PDF_RLE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType.PDF_RLE & Double = js.native
}
