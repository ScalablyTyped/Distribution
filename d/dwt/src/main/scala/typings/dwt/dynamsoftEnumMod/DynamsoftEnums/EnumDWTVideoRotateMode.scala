package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoRotateMode extends StObject
/** Specifies the video rotate mode on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoRotateMode")
@js.native
object EnumDWTVideoRotateMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoRotateMode with Double] = js.native
  
  /** 180 deg Clockwise */
  @js.native
  sealed trait VRM_180_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 2 */ val VRM_180_DEGREES_CLOCKWISE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_180_DEGREES_CLOCKWISE with Double = js.native
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 3 */ val VRM_270_DEGREES_CLOCKWISE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_270_DEGREES_CLOCKWISE with Double = js.native
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE extends EnumDWTVideoRotateMode
  /* 1 */ val VRM_90_DEGREES_CLOCKWISE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_90_DEGREES_CLOCKWISE with Double = js.native
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL extends EnumDWTVideoRotateMode
  /* 5 */ val VRM_FLIP_HORIZONTAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_FLIP_HORIZONTAL with Double = js.native
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL extends EnumDWTVideoRotateMode
  /* 4 */ val VRM_FLIP_VERTICAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_FLIP_VERTICAL with Double = js.native
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE extends EnumDWTVideoRotateMode
  /* 0 */ val VRM_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_NONE with Double = js.native
}
