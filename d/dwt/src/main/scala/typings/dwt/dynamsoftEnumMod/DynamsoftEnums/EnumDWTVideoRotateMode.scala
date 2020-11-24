package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoRotateMode extends js.Object
/** Specifies the video rotate mode on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoRotateMode")
@js.native
object EnumDWTVideoRotateMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoRotateMode with Double] = js.native
  
  /** 180 deg Clockwise */
  @js.native
  sealed trait VRM_180_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 2 */ @js.native
  object VRM_180_DEGREES_CLOCKWISE extends TopLevel[VRM_180_DEGREES_CLOCKWISE with Double]
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 3 */ @js.native
  object VRM_270_DEGREES_CLOCKWISE extends TopLevel[VRM_270_DEGREES_CLOCKWISE with Double]
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 1 */ @js.native
  object VRM_90_DEGREES_CLOCKWISE extends TopLevel[VRM_90_DEGREES_CLOCKWISE with Double]
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL extends EnumDWTVideoRotateMode
  /* 5 */ @js.native
  object VRM_FLIP_HORIZONTAL extends TopLevel[VRM_FLIP_HORIZONTAL with Double]
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL extends EnumDWTVideoRotateMode
  /* 4 */ @js.native
  object VRM_FLIP_VERTICAL extends TopLevel[VRM_FLIP_VERTICAL with Double]
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE extends EnumDWTVideoRotateMode
  /* 0 */ @js.native
  object VRM_NONE extends TopLevel[VRM_NONE with Double]
}
