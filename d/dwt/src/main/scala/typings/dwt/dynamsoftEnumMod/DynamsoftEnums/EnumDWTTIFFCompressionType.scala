package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTTIFFCompressionType extends StObject
/** TIFF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_TIFFCompressionType")
@js.native
object EnumDWTTIFFCompressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTTIFFCompressionType & Double] = js.native
  
  /** Auto mode. */
  @js.native
  sealed trait TIFF_AUTO
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 0 */ val TIFF_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_AUTO & Double = js.native
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait TIFF_FAX3
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 3 */ val TIFF_FAX3: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_FAX3 & Double = js.native
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait TIFF_FAX4
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 4 */ val TIFF_FAX4: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_FAX4 & Double = js.native
  
  @js.native
  sealed trait TIFF_JPEG
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 7 */ val TIFF_JPEG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_JPEG & Double = js.native
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait TIFF_LZW
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 5 */ val TIFF_LZW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_LZW & Double = js.native
  
  /** Dump mode. */
  @js.native
  sealed trait TIFF_NONE
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 1 */ val TIFF_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_NONE & Double = js.native
  
  @js.native
  sealed trait TIFF_PACKBITS
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 32773 */ val TIFF_PACKBITS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_PACKBITS & Double = js.native
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait TIFF_RLE
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 2 */ val TIFF_RLE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_RLE & Double = js.native
  
  /** CCITT T.4 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T4
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 3 */ val TIFF_T4: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_T4 & Double = js.native
  
  /** CCITT T.6 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T6
    extends StObject
       with EnumDWTTIFFCompressionType
  /* 4 */ val TIFF_T6: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_T6 & Double = js.native
}
