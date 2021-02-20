package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFileFormat extends StObject
/** ICAP_IMAGEFILEFORMAT values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FileFormat")
@js.native
object EnumDWTFileFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFileFormat with Double] = js.native
  
  /** Native Microsoft format. Windows Bitmap */
  @js.native
  sealed trait TWFF_BMP extends EnumDWTFileFormat
  /* 2 */ val TWFF_BMP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_BMP with Double = js.native
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU extends EnumDWTFileFormat
  /* 14 */ val TWFF_DEJAVU: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_DEJAVU with Double = js.native
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF extends EnumDWTFileFormat
  /* 9 */ val TWFF_EXIF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_EXIF with Double = js.native
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX extends EnumDWTFileFormat
  /* 5 */ val TWFF_FPX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_FPX with Double = js.native
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF extends EnumDWTFileFormat
  /* 4 */ val TWFF_JFIF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JFIF with Double = js.native
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2 extends EnumDWTFileFormat
  /* 11 */ val TWFF_JP2: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JP2 with Double = js.native
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN extends EnumDWTFileFormat
  /* 12 */ val TWFF_JPN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JPN with Double = js.native
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX extends EnumDWTFileFormat
  /* 13 */ val TWFF_JPX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JPX with Double = js.native
  
  /** A file format from Adobe. 1.91 NB= this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF extends EnumDWTFileFormat
  /* 10 */ val TWFF_PDF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDF with Double = js.native
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA extends EnumDWTFileFormat
  /* 15 */ val TWFF_PDFA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDFA with Double = js.native
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2 extends EnumDWTFileFormat
  /* 16 */ val TWFF_PDFA2: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDFA2 with Double = js.native
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT extends EnumDWTFileFormat
  /* 1 */ val TWFF_PICT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PICT with Double = js.native
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG extends EnumDWTFileFormat
  /* 7 */ val TWFF_PNG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PNG with Double = js.native
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF extends EnumDWTFileFormat
  /* 8 */ val TWFF_SPIFF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_SPIFF with Double = js.native
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF extends EnumDWTFileFormat
  /* 0 */ val TWFF_TIFF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_TIFF with Double = js.native
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI extends EnumDWTFileFormat
  /* 6 */ val TWFF_TIFFMULTI: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_TIFFMULTI with Double = js.native
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM extends EnumDWTFileFormat
  /* 3 */ val TWFF_XBM: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_XBM with Double = js.native
}
