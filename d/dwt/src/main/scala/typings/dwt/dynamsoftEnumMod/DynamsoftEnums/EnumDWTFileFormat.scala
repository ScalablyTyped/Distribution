package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFileFormat extends js.Object
/** ICAP_IMAGEFILEFORMAT values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FileFormat")
@js.native
object EnumDWTFileFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFileFormat with Double] = js.native
  
  /** Native Microsoft format. Windows Bitmap */
  @js.native
  sealed trait TWFF_BMP extends EnumDWTFileFormat
  /* 2 */ @js.native
  object TWFF_BMP extends TopLevel[TWFF_BMP with Double]
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU extends EnumDWTFileFormat
  /* 14 */ @js.native
  object TWFF_DEJAVU extends TopLevel[TWFF_DEJAVU with Double]
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF extends EnumDWTFileFormat
  /* 9 */ @js.native
  object TWFF_EXIF extends TopLevel[TWFF_EXIF with Double]
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX extends EnumDWTFileFormat
  /* 5 */ @js.native
  object TWFF_FPX extends TopLevel[TWFF_FPX with Double]
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF extends EnumDWTFileFormat
  /* 4 */ @js.native
  object TWFF_JFIF extends TopLevel[TWFF_JFIF with Double]
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2 extends EnumDWTFileFormat
  /* 11 */ @js.native
  object TWFF_JP2 extends TopLevel[TWFF_JP2 with Double]
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN extends EnumDWTFileFormat
  /* 12 */ @js.native
  object TWFF_JPN extends TopLevel[TWFF_JPN with Double]
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX extends EnumDWTFileFormat
  /* 13 */ @js.native
  object TWFF_JPX extends TopLevel[TWFF_JPX with Double]
  
  /** A file format from Adobe. 1.91 NB= this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF extends EnumDWTFileFormat
  /* 10 */ @js.native
  object TWFF_PDF extends TopLevel[TWFF_PDF with Double]
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA extends EnumDWTFileFormat
  /* 15 */ @js.native
  object TWFF_PDFA extends TopLevel[TWFF_PDFA with Double]
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2 extends EnumDWTFileFormat
  /* 16 */ @js.native
  object TWFF_PDFA2 extends TopLevel[TWFF_PDFA2 with Double]
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT extends EnumDWTFileFormat
  /* 1 */ @js.native
  object TWFF_PICT extends TopLevel[TWFF_PICT with Double]
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG extends EnumDWTFileFormat
  /* 7 */ @js.native
  object TWFF_PNG extends TopLevel[TWFF_PNG with Double]
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF extends EnumDWTFileFormat
  /* 8 */ @js.native
  object TWFF_SPIFF extends TopLevel[TWFF_SPIFF with Double]
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF extends EnumDWTFileFormat
  /* 0 */ @js.native
  object TWFF_TIFF extends TopLevel[TWFF_TIFF with Double]
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI extends EnumDWTFileFormat
  /* 6 */ @js.native
  object TWFF_TIFFMULTI extends TopLevel[TWFF_TIFFMULTI with Double]
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM extends EnumDWTFileFormat
  /* 3 */ @js.native
  object TWFF_XBM extends TopLevel[TWFF_XBM with Double]
}
