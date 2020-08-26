package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTTIFFCompressionType extends js.Object

/** TIFF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_TIFFCompressionType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTTIFFCompressionType with Double] = js.native
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

