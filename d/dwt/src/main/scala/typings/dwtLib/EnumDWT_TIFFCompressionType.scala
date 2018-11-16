package typings
package dwtLib

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
  sealed trait TIFF_AUTO
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait TIFF_FAX3
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait TIFF_FAX4
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  @js.native
  sealed trait TIFF_JPEG
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait TIFF_LZW
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** Dump mode. */
  @js.native
  sealed trait TIFF_NONE
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  @js.native
  sealed trait TIFF_PACKBITS
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait TIFF_RLE
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** CCITT T.4 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T4
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /** CCITT T.6 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T6
    extends dwtLib.EnumDWT_TIFFCompressionType
  
  /* 0 */ val TIFF_AUTO: TIFF_AUTO with scala.Double = js.native
  /* 3 */ val TIFF_FAX3: TIFF_FAX3 with scala.Double = js.native
  /* 4 */ val TIFF_FAX4: TIFF_FAX4 with scala.Double = js.native
  /* 7 */ val TIFF_JPEG: TIFF_JPEG with scala.Double = js.native
  /* 5 */ val TIFF_LZW: TIFF_LZW with scala.Double = js.native
  /* 1 */ val TIFF_NONE: TIFF_NONE with scala.Double = js.native
  /* 32773 */ val TIFF_PACKBITS: TIFF_PACKBITS with scala.Double = js.native
  /* 2 */ val TIFF_RLE: TIFF_RLE with scala.Double = js.native
  /* 3 */ val TIFF_T4: TIFF_T4 with scala.Double = js.native
  /* 4 */ val TIFF_T6: TIFF_T6 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_TIFFCompressionType with scala.Double] = js.native
}

