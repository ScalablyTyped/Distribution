package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_FileFormat extends js.Object

/** ICAP_IMAGEFILEFORMAT values. */
@JSGlobal("EnumDWT_FileFormat")
@js.native
object EnumDWT_FileFormat extends js.Object {
  /** Native Microsoft format. Windows Bitmap */
  @js.native
  sealed trait TWFF_BMP extends EnumDWT_FileFormat
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU extends EnumDWT_FileFormat
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF extends EnumDWT_FileFormat
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX extends EnumDWT_FileFormat
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF extends EnumDWT_FileFormat
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2 extends EnumDWT_FileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN extends EnumDWT_FileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX extends EnumDWT_FileFormat
  
  /** A file format from Adobe. 1.91 NB: this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF extends EnumDWT_FileFormat
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA extends EnumDWT_FileFormat
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2 extends EnumDWT_FileFormat
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT extends EnumDWT_FileFormat
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG extends EnumDWT_FileFormat
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF extends EnumDWT_FileFormat
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF extends EnumDWT_FileFormat
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI extends EnumDWT_FileFormat
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM extends EnumDWT_FileFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_FileFormat with Double] = js.native
  /* 2 */ @js.native
  object TWFF_BMP extends TopLevel[TWFF_BMP with Double]
  
  /* 14 */ @js.native
  object TWFF_DEJAVU extends TopLevel[TWFF_DEJAVU with Double]
  
  /* 9 */ @js.native
  object TWFF_EXIF extends TopLevel[TWFF_EXIF with Double]
  
  /* 5 */ @js.native
  object TWFF_FPX extends TopLevel[TWFF_FPX with Double]
  
  /* 4 */ @js.native
  object TWFF_JFIF extends TopLevel[TWFF_JFIF with Double]
  
  /* 11 */ @js.native
  object TWFF_JP2 extends TopLevel[TWFF_JP2 with Double]
  
  /* 12 */ @js.native
  object TWFF_JPN extends TopLevel[TWFF_JPN with Double]
  
  /* 13 */ @js.native
  object TWFF_JPX extends TopLevel[TWFF_JPX with Double]
  
  /* 10 */ @js.native
  object TWFF_PDF extends TopLevel[TWFF_PDF with Double]
  
  /* 15 */ @js.native
  object TWFF_PDFA extends TopLevel[TWFF_PDFA with Double]
  
  /* 16 */ @js.native
  object TWFF_PDFA2 extends TopLevel[TWFF_PDFA2 with Double]
  
  /* 1 */ @js.native
  object TWFF_PICT extends TopLevel[TWFF_PICT with Double]
  
  /* 7 */ @js.native
  object TWFF_PNG extends TopLevel[TWFF_PNG with Double]
  
  /* 8 */ @js.native
  object TWFF_SPIFF extends TopLevel[TWFF_SPIFF with Double]
  
  /* 0 */ @js.native
  object TWFF_TIFF extends TopLevel[TWFF_TIFF with Double]
  
  /* 6 */ @js.native
  object TWFF_TIFFMULTI extends TopLevel[TWFF_TIFFMULTI with Double]
  
  /* 3 */ @js.native
  object TWFF_XBM extends TopLevel[TWFF_XBM with Double]
  
}

