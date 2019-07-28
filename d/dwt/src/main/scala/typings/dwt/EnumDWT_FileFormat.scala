package typings.dwt

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
  
  /* 2 */ val TWFF_BMP: typings.dwt.EnumDWT_FileFormat.TWFF_BMP with Double = js.native
  /* 14 */ val TWFF_DEJAVU: typings.dwt.EnumDWT_FileFormat.TWFF_DEJAVU with Double = js.native
  /* 9 */ val TWFF_EXIF: typings.dwt.EnumDWT_FileFormat.TWFF_EXIF with Double = js.native
  /* 5 */ val TWFF_FPX: typings.dwt.EnumDWT_FileFormat.TWFF_FPX with Double = js.native
  /* 4 */ val TWFF_JFIF: typings.dwt.EnumDWT_FileFormat.TWFF_JFIF with Double = js.native
  /* 11 */ val TWFF_JP2: typings.dwt.EnumDWT_FileFormat.TWFF_JP2 with Double = js.native
  /* 12 */ val TWFF_JPN: typings.dwt.EnumDWT_FileFormat.TWFF_JPN with Double = js.native
  /* 13 */ val TWFF_JPX: typings.dwt.EnumDWT_FileFormat.TWFF_JPX with Double = js.native
  /* 10 */ val TWFF_PDF: typings.dwt.EnumDWT_FileFormat.TWFF_PDF with Double = js.native
  /* 15 */ val TWFF_PDFA: typings.dwt.EnumDWT_FileFormat.TWFF_PDFA with Double = js.native
  /* 16 */ val TWFF_PDFA2: typings.dwt.EnumDWT_FileFormat.TWFF_PDFA2 with Double = js.native
  /* 1 */ val TWFF_PICT: typings.dwt.EnumDWT_FileFormat.TWFF_PICT with Double = js.native
  /* 7 */ val TWFF_PNG: typings.dwt.EnumDWT_FileFormat.TWFF_PNG with Double = js.native
  /* 8 */ val TWFF_SPIFF: typings.dwt.EnumDWT_FileFormat.TWFF_SPIFF with Double = js.native
  /* 0 */ val TWFF_TIFF: typings.dwt.EnumDWT_FileFormat.TWFF_TIFF with Double = js.native
  /* 6 */ val TWFF_TIFFMULTI: typings.dwt.EnumDWT_FileFormat.TWFF_TIFFMULTI with Double = js.native
  /* 3 */ val TWFF_XBM: typings.dwt.EnumDWT_FileFormat.TWFF_XBM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_FileFormat with Double] = js.native
}

