package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_PlatformType extends js.Object

@JSGlobal("EnumDWT_PlatformType")
@js.native
object EnumDWT_PlatformType extends js.Object {
  /// Fit the image to the width of the window
  @js.native
  sealed trait enumLinux extends EnumDWT_PlatformType
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac extends EnumDWT_PlatformType
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow extends EnumDWT_PlatformType
  
  /* 2 */ val enumLinux: typings.dwt.EnumDWT_PlatformType.enumLinux with Double = js.native
  /* 1 */ val enumMac: typings.dwt.EnumDWT_PlatformType.enumMac with Double = js.native
  /* 0 */ val enumWindow: typings.dwt.EnumDWT_PlatformType.enumWindow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_PlatformType with Double] = js.native
}

