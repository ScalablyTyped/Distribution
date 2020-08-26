package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTVideoRotateMode extends js.Object

/** Specifies the video rotate mode on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoRotateMode")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoRotateMode with Double] = js.native
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

