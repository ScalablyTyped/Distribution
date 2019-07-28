package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_TIFFCompressionType extends js.Object

/** TIFF file compression type. */
@JSGlobal("EnumDWT_TIFFCompressionType")
@js.native
object EnumDWT_TIFFCompressionType extends js.Object {
  /** Auto mode. */
  @js.native
  sealed trait TIFF_AUTO extends EnumDWT_TIFFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait TIFF_FAX3 extends EnumDWT_TIFFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait TIFF_FAX4 extends EnumDWT_TIFFCompressionType
  
  @js.native
  sealed trait TIFF_JPEG extends EnumDWT_TIFFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait TIFF_LZW extends EnumDWT_TIFFCompressionType
  
  /** Dump mode. */
  @js.native
  sealed trait TIFF_NONE extends EnumDWT_TIFFCompressionType
  
  @js.native
  sealed trait TIFF_PACKBITS extends EnumDWT_TIFFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait TIFF_RLE extends EnumDWT_TIFFCompressionType
  
  /** CCITT T.4 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T4 extends EnumDWT_TIFFCompressionType
  
  /** CCITT T.6 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T6 extends EnumDWT_TIFFCompressionType
  
  /* 0 */ val TIFF_AUTO: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_AUTO with Double = js.native
  /* 3 */ val TIFF_FAX3: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_FAX3 with Double = js.native
  /* 4 */ val TIFF_FAX4: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_FAX4 with Double = js.native
  /* 7 */ val TIFF_JPEG: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_JPEG with Double = js.native
  /* 5 */ val TIFF_LZW: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_LZW with Double = js.native
  /* 1 */ val TIFF_NONE: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_NONE with Double = js.native
  /* 32773 */ val TIFF_PACKBITS: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_PACKBITS with Double = js.native
  /* 2 */ val TIFF_RLE: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_RLE with Double = js.native
  /* 3 */ val TIFF_T4: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_T4 with Double = js.native
  /* 4 */ val TIFF_T6: typings.dwt.EnumDWT_TIFFCompressionType.TIFF_T6 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_TIFFCompressionType with Double] = js.native
}

