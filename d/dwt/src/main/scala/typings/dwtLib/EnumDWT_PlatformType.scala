package typings
package dwtLib

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
  sealed trait enumLinux
    extends dwtLib.EnumDWT_PlatformType
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac
    extends dwtLib.EnumDWT_PlatformType
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow
    extends dwtLib.EnumDWT_PlatformType
  
  /* 2 */ val enumLinux: enumLinux with scala.Double = js.native
  /* 1 */ val enumMac: enumMac with scala.Double = js.native
  /* 0 */ val enumWindow: enumWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_PlatformType with scala.Double] = js.native
}

