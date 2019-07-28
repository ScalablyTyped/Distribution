package typings.dwt

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
  sealed trait VRM_180_DEGREES_CLOCKWISE extends EnumDWT_VideoRotateMode
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE extends EnumDWT_VideoRotateMode
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE extends EnumDWT_VideoRotateMode
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL extends EnumDWT_VideoRotateMode
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL extends EnumDWT_VideoRotateMode
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE extends EnumDWT_VideoRotateMode
  
  /* 2 */ val VRM_180_DEGREES_CLOCKWISE: typings.dwt.EnumDWT_VideoRotateMode.VRM_180_DEGREES_CLOCKWISE with Double = js.native
  /* 3 */ val VRM_270_DEGREES_CLOCKWISE: typings.dwt.EnumDWT_VideoRotateMode.VRM_270_DEGREES_CLOCKWISE with Double = js.native
  /* 1 */ val VRM_90_DEGREES_CLOCKWISE: typings.dwt.EnumDWT_VideoRotateMode.VRM_90_DEGREES_CLOCKWISE with Double = js.native
  /* 5 */ val VRM_FLIP_HORIZONTAL: typings.dwt.EnumDWT_VideoRotateMode.VRM_FLIP_HORIZONTAL with Double = js.native
  /* 4 */ val VRM_FLIP_VERTICAL: typings.dwt.EnumDWT_VideoRotateMode.VRM_FLIP_VERTICAL with Double = js.native
  /* 0 */ val VRM_NONE: typings.dwt.EnumDWT_VideoRotateMode.VRM_NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_VideoRotateMode with Double] = js.native
}

