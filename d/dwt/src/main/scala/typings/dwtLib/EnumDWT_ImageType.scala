package typings
package dwtLib

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
  sealed trait IT_ALL
    extends dwtLib.EnumDWT_ImageType
  
  /** Native Microsoft format. */
  @js.native
  sealed trait IT_BMP
    extends dwtLib.EnumDWT_ImageType
  
  /** JPEG format. */
  @js.native
  sealed trait IT_JPG
    extends dwtLib.EnumDWT_ImageType
  
  /** A file format from Adobe. */
  @js.native
  sealed trait IT_PDF
    extends dwtLib.EnumDWT_ImageType
  
  /** An image format standard intended for use on the web, replaces GIF. */
  @js.native
  sealed trait IT_PNG
    extends dwtLib.EnumDWT_ImageType
  
  /** Tagged Image File Format. */
  @js.native
  sealed trait IT_TIF
    extends dwtLib.EnumDWT_ImageType
  
  /* 5 */ val IT_ALL: IT_ALL with scala.Double = js.native
  /* 0 */ val IT_BMP: IT_BMP with scala.Double = js.native
  /* 1 */ val IT_JPG: IT_JPG with scala.Double = js.native
  /* 4 */ val IT_PDF: IT_PDF with scala.Double = js.native
  /* 3 */ val IT_PNG: IT_PNG with scala.Double = js.native
  /* 2 */ val IT_TIF: IT_TIF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_ImageType with scala.Double] = js.native
}

