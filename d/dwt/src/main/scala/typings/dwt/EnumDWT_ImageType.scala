package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ImageType with Double] = js.native
  /* 5 */ @js.native
  object IT_ALL extends TopLevel[IT_ALL with Double]
  
  /* 0 */ @js.native
  object IT_BMP extends TopLevel[IT_BMP with Double]
  
  /* 1 */ @js.native
  object IT_JPG extends TopLevel[IT_JPG with Double]
  
  /* 4 */ @js.native
  object IT_PDF extends TopLevel[IT_PDF with Double]
  
  /* 3 */ @js.native
  object IT_PNG extends TopLevel[IT_PNG with Double]
  
  /* 2 */ @js.native
  object IT_TIF extends TopLevel[IT_TIF with Double]
  
}

