package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_PlatformType.enumLinux
import typings.dwt.EnumDWT_PlatformType.enumMac
import typings.dwt.EnumDWT_PlatformType.enumWindow
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_PlatformType with Double] = js.native
  /* 2 */ @js.native
  object enumLinux extends TopLevel[enumLinux with Double]
  
  /* 1 */ @js.native
  object enumMac extends TopLevel[enumMac with Double]
  
  /* 0 */ @js.native
  object enumWindow extends TopLevel[enumWindow with Double]
  
}

