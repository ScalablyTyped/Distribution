package typings
package dwtLib

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
  sealed trait TWFF_BMP
    extends dwtLib.EnumDWT_FileFormat
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU
    extends dwtLib.EnumDWT_FileFormat
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF
    extends dwtLib.EnumDWT_FileFormat
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX
    extends dwtLib.EnumDWT_FileFormat
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF
    extends dwtLib.EnumDWT_FileFormat
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2
    extends dwtLib.EnumDWT_FileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN
    extends dwtLib.EnumDWT_FileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX
    extends dwtLib.EnumDWT_FileFormat
  
  /** A file format from Adobe. 1.91 NB: this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF
    extends dwtLib.EnumDWT_FileFormat
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA
    extends dwtLib.EnumDWT_FileFormat
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2
    extends dwtLib.EnumDWT_FileFormat
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT
    extends dwtLib.EnumDWT_FileFormat
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG
    extends dwtLib.EnumDWT_FileFormat
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF
    extends dwtLib.EnumDWT_FileFormat
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF
    extends dwtLib.EnumDWT_FileFormat
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI
    extends dwtLib.EnumDWT_FileFormat
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM
    extends dwtLib.EnumDWT_FileFormat
  
  /* 2 */ val TWFF_BMP: TWFF_BMP with scala.Double = js.native
  /* 14 */ val TWFF_DEJAVU: TWFF_DEJAVU with scala.Double = js.native
  /* 9 */ val TWFF_EXIF: TWFF_EXIF with scala.Double = js.native
  /* 5 */ val TWFF_FPX: TWFF_FPX with scala.Double = js.native
  /* 4 */ val TWFF_JFIF: TWFF_JFIF with scala.Double = js.native
  /* 11 */ val TWFF_JP2: TWFF_JP2 with scala.Double = js.native
  /* 12 */ val TWFF_JPN: TWFF_JPN with scala.Double = js.native
  /* 13 */ val TWFF_JPX: TWFF_JPX with scala.Double = js.native
  /* 10 */ val TWFF_PDF: TWFF_PDF with scala.Double = js.native
  /* 15 */ val TWFF_PDFA: TWFF_PDFA with scala.Double = js.native
  /* 16 */ val TWFF_PDFA2: TWFF_PDFA2 with scala.Double = js.native
  /* 1 */ val TWFF_PICT: TWFF_PICT with scala.Double = js.native
  /* 7 */ val TWFF_PNG: TWFF_PNG with scala.Double = js.native
  /* 8 */ val TWFF_SPIFF: TWFF_SPIFF with scala.Double = js.native
  /* 0 */ val TWFF_TIFF: TWFF_TIFF with scala.Double = js.native
  /* 6 */ val TWFF_TIFFMULTI: TWFF_TIFFMULTI with scala.Double = js.native
  /* 3 */ val TWFF_XBM: TWFF_XBM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_FileFormat with scala.Double] = js.native
}

