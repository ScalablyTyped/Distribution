package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTVideoRotateMode extends js.Object

/** Specifies the video rotate mode on a video capture device. */
@JSGlobal("EnumDWT_VideoRotateMode")
@js.native
object EnumDWTVideoRotateMode extends js.Object {
  /** 180 deg Clockwise */
  @js.native
  sealed trait VRM_180_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL extends EnumDWTVideoRotateMode
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL extends EnumDWTVideoRotateMode
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE extends EnumDWTVideoRotateMode
  
}

