package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTImageType extends js.Object

/** Image type */
@JSGlobal("EnumDWT_ImageType")
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
  
  /** A file format from Adobe. */
  @js.native
  sealed trait IT_PDF extends EnumDWTImageType
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait IT_PNG extends EnumDWTImageType
  
  /** Tagged Image File Format. */
  @js.native
  sealed trait IT_TIF extends EnumDWTImageType
  
}

