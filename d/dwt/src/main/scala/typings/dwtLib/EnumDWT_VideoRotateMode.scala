package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_VideoRotateMode extends js.Object

/** Specifies the video rotate mode on a video capture device. */
@JSGlobal("EnumDWT_VideoRotateMode")
@js.native
object EnumDWT_VideoRotateMode extends js.Object {
  /** 180 deg Clockwise */
  @js.native
  sealed trait VRM_180_DEGREES_CLOCKWISE
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE
    extends dwtLib.EnumDWT_VideoRotateMode
  
  /* 2 */ val VRM_180_DEGREES_CLOCKWISE: VRM_180_DEGREES_CLOCKWISE with scala.Double = js.native
  /* 3 */ val VRM_270_DEGREES_CLOCKWISE: VRM_270_DEGREES_CLOCKWISE with scala.Double = js.native
  /* 1 */ val VRM_90_DEGREES_CLOCKWISE: VRM_90_DEGREES_CLOCKWISE with scala.Double = js.native
  /* 5 */ val VRM_FLIP_HORIZONTAL: VRM_FLIP_HORIZONTAL with scala.Double = js.native
  /* 4 */ val VRM_FLIP_VERTICAL: VRM_FLIP_VERTICAL with scala.Double = js.native
  /* 0 */ val VRM_NONE: VRM_NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_VideoRotateMode with scala.Double] = js.native
}

