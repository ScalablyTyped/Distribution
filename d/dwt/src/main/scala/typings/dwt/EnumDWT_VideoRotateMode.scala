package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_VideoRotateMode with Double] = js.native
  /* 2 */ @js.native
  object VRM_180_DEGREES_CLOCKWISE extends TopLevel[VRM_180_DEGREES_CLOCKWISE with Double]
  
  /* 3 */ @js.native
  object VRM_270_DEGREES_CLOCKWISE extends TopLevel[VRM_270_DEGREES_CLOCKWISE with Double]
  
  /* 1 */ @js.native
  object VRM_90_DEGREES_CLOCKWISE extends TopLevel[VRM_90_DEGREES_CLOCKWISE with Double]
  
  /* 5 */ @js.native
  object VRM_FLIP_HORIZONTAL extends TopLevel[VRM_FLIP_HORIZONTAL with Double]
  
  /* 4 */ @js.native
  object VRM_FLIP_VERTICAL extends TopLevel[VRM_FLIP_VERTICAL with Double]
  
  /* 0 */ @js.native
  object VRM_NONE extends TopLevel[VRM_NONE with Double]
  
}

