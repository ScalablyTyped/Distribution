package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTTIFFCompressionType extends js.Object

/** TIFF file compression type. */
@JSGlobal("EnumDWT_TIFFCompressionType")
@js.native
object EnumDWTTIFFCompressionType extends js.Object {
  /** Auto mode. */
  @js.native
  sealed trait TIFF_AUTO extends EnumDWTTIFFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait TIFF_FAX3 extends EnumDWTTIFFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait TIFF_FAX4 extends EnumDWTTIFFCompressionType
  
  @js.native
  sealed trait TIFF_JPEG extends EnumDWTTIFFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait TIFF_LZW extends EnumDWTTIFFCompressionType
  
  /** Dump mode. */
  @js.native
  sealed trait TIFF_NONE extends EnumDWTTIFFCompressionType
  
  @js.native
  sealed trait TIFF_PACKBITS extends EnumDWTTIFFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait TIFF_RLE extends EnumDWTTIFFCompressionType
  
  /** CCITT T.4 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T4 extends EnumDWTTIFFCompressionType
  
  /** CCITT T.6 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T6 extends EnumDWTTIFFCompressionType
  
}

