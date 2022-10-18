package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFileFormat extends StObject
/** ICAP_IMAGEFILEFORMAT values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FileFormat")
@js.native
object EnumDWTFileFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFileFormat & Double] = js.native
  
  /** Native Microsoft format. Windows Bitmap */
  @js.native
  sealed trait TWFF_BMP
    extends StObject
       with EnumDWTFileFormat
  /* 2 */ val TWFF_BMP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_BMP & Double = js.native
  
  /** A file format from LizardTech. 1.91 */
  @js.native
  sealed trait TWFF_DEJAVU
    extends StObject
       with EnumDWTFileFormat
  /* 14 */ val TWFF_DEJAVU: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_DEJAVU & Double = js.native
  
  /** File format for use with digital cameras. */
  @js.native
  sealed trait TWFF_EXIF
    extends StObject
       with EnumDWTFileFormat
  /* 9 */ val TWFF_EXIF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_EXIF & Double = js.native
  
  /** FlashPix, used with digital cameras. Flash Pix */
  @js.native
  sealed trait TWFF_FPX
    extends StObject
       with EnumDWTFileFormat
  /* 5 */ val TWFF_FPX: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_FPX & Double = js.native
  
  /** Wrapper for JPEG images. JPEG File Interchange Format */
  @js.native
  sealed trait TWFF_JFIF
    extends StObject
       with EnumDWTFileFormat
  /* 4 */ val TWFF_JFIF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JFIF & Double = js.native
  
  /** A file format from the Joint Photographic Experts Group. 1.91 */
  @js.native
  sealed trait TWFF_JP2
    extends StObject
       with EnumDWTFileFormat
  /* 11 */ val TWFF_JP2: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JP2 & Double = js.native
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPN
    extends StObject
       with EnumDWTFileFormat
  /* 12 */ val TWFF_JPN: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JPN & Double = js.native
  
  /** 1.91 */
  @js.native
  sealed trait TWFF_JPX
    extends StObject
       with EnumDWTFileFormat
  /* 13 */ val TWFF_JPX: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_JPX & Double = js.native
  
  /** A file format from Adobe. 1.91 NB= this is not PDF/A  */
  @js.native
  sealed trait TWFF_PDF
    extends StObject
       with EnumDWTFileFormat
  /* 10 */ val TWFF_PDF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDF & Double = js.native
  
  /** A file format from Adobe. 2.0 */
  @js.native
  sealed trait TWFF_PDFA
    extends StObject
       with EnumDWTFileFormat
  /* 15 */ val TWFF_PDFA: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDFA & Double = js.native
  
  /** 2.1 Adobe PDF/A, Version 2 */
  @js.native
  sealed trait TWFF_PDFA2
    extends StObject
       with EnumDWTFileFormat
  /* 16 */ val TWFF_PDFA2: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PDFA2 & Double = js.native
  
  /** Native Macintosh format. Macintosh PICT    */
  @js.native
  sealed trait TWFF_PICT
    extends StObject
       with EnumDWTFileFormat
  /* 1 */ val TWFF_PICT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PICT & Double = js.native
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait TWFF_PNG
    extends StObject
       with EnumDWTFileFormat
  /* 7 */ val TWFF_PNG: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_PNG & Double = js.native
  
  /** A standard from JPEG, intended to replace JFIF, also supports JBIG. */
  @js.native
  sealed trait TWFF_SPIFF
    extends StObject
       with EnumDWTFileFormat
  /* 8 */ val TWFF_SPIFF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_SPIFF & Double = js.native
  
  /** Used for document imaging. Tagged Image File Format */
  @js.native
  sealed trait TWFF_TIFF
    extends StObject
       with EnumDWTFileFormat
  /* 0 */ val TWFF_TIFF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_TIFF & Double = js.native
  
  /** Multi-page TIFF files. Multi-page tiff file */
  @js.native
  sealed trait TWFF_TIFFMULTI
    extends StObject
       with EnumDWTFileFormat
  /* 6 */ val TWFF_TIFFMULTI: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_TIFFMULTI & Double = js.native
  
  /** Used for document imaging. X-Windows Bitmap */
  @js.native
  sealed trait TWFF_XBM
    extends StObject
       with EnumDWTFileFormat
  /* 3 */ val TWFF_XBM: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat.TWFF_XBM & Double = js.native
}
