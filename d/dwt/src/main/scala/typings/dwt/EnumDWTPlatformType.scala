package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTPlatformType extends js.Object

@JSGlobal("EnumDWT_PlatformType")
@js.native
object EnumDWTPlatformType extends js.Object {
  /// Fit the image to the width of the window
  @js.native
  sealed trait enumLinux extends EnumDWTPlatformType
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac extends EnumDWTPlatformType
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow extends EnumDWTPlatformType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPlatformType with Double] = js.native
  /* 2 */ @js.native
  object enumLinux extends TopLevel[enumLinux with Double]
  
  /* 1 */ @js.native
  object enumMac extends TopLevel[enumMac with Double]
  
  /* 0 */ @js.native
  object enumWindow extends TopLevel[enumWindow with Double]
  
}

