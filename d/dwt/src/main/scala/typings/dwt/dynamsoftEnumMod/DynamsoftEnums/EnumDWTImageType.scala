package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTImageType extends StObject
/** Image type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ImageType")
@js.native
object EnumDWTImageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTImageType & Double] = js.native
  
  /** All supported formats which are bmp, jpg, tif, png and pdf */
  @js.native
  sealed trait IT_ALL
    extends StObject
       with EnumDWTImageType
  /* 5 */ val IT_ALL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_ALL & Double = js.native
  
  /** Native Microsoft format. */
  @js.native
  sealed trait IT_BMP
    extends StObject
       with EnumDWTImageType
  /* 0 */ val IT_BMP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_BMP & Double = js.native
  
  /** JPEG format. */
  @js.native
  sealed trait IT_JPG
    extends StObject
       with EnumDWTImageType
  /* 1 */ val IT_JPG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_JPG & Double = js.native
  
  @js.native
  sealed trait IT_MULTIPAGE_PDF
    extends StObject
       with EnumDWTImageType
  /* 7 */ val IT_MULTIPAGE_PDF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_MULTIPAGE_PDF & Double = js.native
  
  @js.native
  sealed trait IT_MULTIPAGE_TIF
    extends StObject
       with EnumDWTImageType
  /* 8 */ val IT_MULTIPAGE_TIF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_MULTIPAGE_TIF & Double = js.native
  
  /** A file format from Adobe. */
  @js.native
  sealed trait IT_PDF
    extends StObject
       with EnumDWTImageType
  /* 4 */ val IT_PDF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_PDF & Double = js.native
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait IT_PNG
    extends StObject
       with EnumDWTImageType
  /* 3 */ val IT_PNG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_PNG & Double = js.native
  
  /** Tagged Image File Format. */
  @js.native
  sealed trait IT_TIF
    extends StObject
       with EnumDWTImageType
  /* 2 */ val IT_TIF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType.IT_TIF & Double = js.native
}
