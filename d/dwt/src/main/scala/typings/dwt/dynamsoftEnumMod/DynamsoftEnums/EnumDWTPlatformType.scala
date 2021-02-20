package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPlatformType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PlatformType")
@js.native
object EnumDWTPlatformType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPlatformType with Double] = js.native
  
  /// Fit the image to the width of the window
  @js.native
  sealed trait enumLinux extends EnumDWTPlatformType
  /* 2 */ val enumLinux: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumLinux with Double = js.native
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac extends EnumDWTPlatformType
  /* 1 */ val enumMac: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumMac with Double = js.native
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow extends EnumDWTPlatformType
  /* 0 */ val enumWindow: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumWindow with Double = js.native
}
