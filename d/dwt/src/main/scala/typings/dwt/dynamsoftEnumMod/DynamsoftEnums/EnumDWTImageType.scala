package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTImageType extends js.Object

/** Image type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ImageType")
@js.native
object EnumDWTImageType extends js.Object {
  /** All supported formats which are bmp, jpg, tif, png and pdf */
  @js.native
  sealed trait IT_ALL extends EnumDWTImageType
  
  /** Native Microsoft format. */
  @js.native
  sealed trait IT_BMP extends EnumDWTImageType
  
  /** JPEG format. */
  @js.native
  sealed trait IT_JPG extends EnumDWTImageType
  
  @js.native
  sealed trait IT_MULTIPAGE_PDF extends EnumDWTImageType
  
  @js.native
  sealed trait IT_MULTIPAGE_TIF extends EnumDWTImageType
  
  /** A file format from Adobe. */
  @js.native
  sealed trait IT_PDF extends EnumDWTImageType
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait IT_PNG extends EnumDWTImageType
  
  /** Tagged Image File Format. */
  @js.native
  sealed trait IT_TIF extends EnumDWTImageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTImageType with Double] = js.native
  /* 5 */ @js.native
  object IT_ALL extends TopLevel[IT_ALL with Double]
  
  /* 0 */ @js.native
  object IT_BMP extends TopLevel[IT_BMP with Double]
  
  /* 1 */ @js.native
  object IT_JPG extends TopLevel[IT_JPG with Double]
  
  /* 7 */ @js.native
  object IT_MULTIPAGE_PDF extends TopLevel[IT_MULTIPAGE_PDF with Double]
  
  /* 8 */ @js.native
  object IT_MULTIPAGE_TIF extends TopLevel[IT_MULTIPAGE_TIF with Double]
  
  /* 4 */ @js.native
  object IT_PDF extends TopLevel[IT_PDF with Double]
  
  /* 3 */ @js.native
  object IT_PNG extends TopLevel[IT_PNG with Double]
  
  /* 2 */ @js.native
  object IT_TIF extends TopLevel[IT_TIF with Double]
  
}

