package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_TIFFCompressionType with Double] = js.native
  /* 0 */ @js.native
  object TIFF_AUTO extends TopLevel[TIFF_AUTO with Double]
  
  /* 3 */ @js.native
  object TIFF_FAX3 extends TopLevel[TIFF_FAX3 with Double]
  
  /* 4 */ @js.native
  object TIFF_FAX4 extends TopLevel[TIFF_FAX4 with Double]
  
  /* 7 */ @js.native
  object TIFF_JPEG extends TopLevel[TIFF_JPEG with Double]
  
  /* 5 */ @js.native
  object TIFF_LZW extends TopLevel[TIFF_LZW with Double]
  
  /* 1 */ @js.native
  object TIFF_NONE extends TopLevel[TIFF_NONE with Double]
  
  /* 32773 */ @js.native
  object TIFF_PACKBITS extends TopLevel[TIFF_PACKBITS with Double]
  
  /* 2 */ @js.native
  object TIFF_RLE extends TopLevel[TIFF_RLE with Double]
  
  /* 3 */ @js.native
  object TIFF_T4 extends TopLevel[TIFF_T4 with Double]
  
  /* 4 */ @js.native
  object TIFF_T6 extends TopLevel[TIFF_T6 with Double]
  
}

