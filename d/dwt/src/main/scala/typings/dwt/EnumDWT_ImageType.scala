package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ImageType extends js.Object

/** Image type */
@JSGlobal("EnumDWT_ImageType")
@js.native
object EnumDWT_ImageType extends js.Object {
  /** All supported formats which are bmp, jpg, tif, png and pdf */
  @js.native
  sealed trait IT_ALL extends EnumDWT_ImageType
  
  /** Native Microsoft format. */
  @js.native
  sealed trait IT_BMP extends EnumDWT_ImageType
  
  /** JPEG format. */
  @js.native
  sealed trait IT_JPG extends EnumDWT_ImageType
  
  /** A file format from Adobe. */
  @js.native
  sealed trait IT_PDF extends EnumDWT_ImageType
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait IT_PNG extends EnumDWT_ImageType
  
  /** Tagged Image File Format. */
  @js.native
  sealed trait IT_TIF extends EnumDWT_ImageType
  
  /* 5 */ val IT_ALL: typings.dwt.EnumDWT_ImageType.IT_ALL with Double = js.native
  /* 0 */ val IT_BMP: typings.dwt.EnumDWT_ImageType.IT_BMP with Double = js.native
  /* 1 */ val IT_JPG: typings.dwt.EnumDWT_ImageType.IT_JPG with Double = js.native
  /* 4 */ val IT_PDF: typings.dwt.EnumDWT_ImageType.IT_PDF with Double = js.native
  /* 3 */ val IT_PNG: typings.dwt.EnumDWT_ImageType.IT_PNG with Double = js.native
  /* 2 */ val IT_TIF: typings.dwt.EnumDWT_ImageType.IT_TIF with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ImageType with Double] = js.native
}

