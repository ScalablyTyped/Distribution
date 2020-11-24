package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPlatformType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PlatformType")
@js.native
object EnumDWTPlatformType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPlatformType with Double] = js.native
  
  /// Fit the image to the width of the window
  @js.native
  sealed trait enumLinux extends EnumDWTPlatformType
  /* 2 */ @js.native
  object enumLinux extends TopLevel[enumLinux with Double]
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac extends EnumDWTPlatformType
  /* 1 */ @js.native
  object enumMac extends TopLevel[enumMac with Double]
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow extends EnumDWTPlatformType
  /* 0 */ @js.native
  object enumWindow extends TopLevel[enumWindow with Double]
}
