package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTFileFormat extends js.Object

/** ICAP_IMAGEFILEFORMAT values. */
@JSGlobal("EnumDWT_FileFormat")
@js.native
object EnumDWTFileFormat extends js.Object {
  /** Native Microsoft format. Windows Bitmap */
  @js.native
  sealed trait TWFF_BMP extends EnumDWTFileFormat
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU extends EnumDWTFileFormat
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF extends EnumDWTFileFormat
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX extends EnumDWTFileFormat
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF extends EnumDWTFileFormat
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2 extends EnumDWTFileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN extends EnumDWTFileFormat
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX extends EnumDWTFileFormat
  
  /** A file format from Adobe. 1.91 NB: this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF extends EnumDWTFileFormat
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA extends EnumDWTFileFormat
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2 extends EnumDWTFileFormat
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT extends EnumDWTFileFormat
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG extends EnumDWTFileFormat
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF extends EnumDWTFileFormat
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF extends EnumDWTFileFormat
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI extends EnumDWTFileFormat
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM extends EnumDWTFileFormat
  
}

