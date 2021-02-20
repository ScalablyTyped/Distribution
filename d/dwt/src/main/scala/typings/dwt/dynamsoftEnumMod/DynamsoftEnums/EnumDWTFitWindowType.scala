package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFitWindowType extends StObject
/** Fit window type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FitWindowType")
@js.native
object EnumDWTFitWindowType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFitWindowType with Double] = js.native
  
  /** Fit the image to the width and height of the window */
  @js.native
  sealed trait enumFitWindow extends EnumDWTFitWindowType
  /* 0 */ val enumFitWindow: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindow with Double = js.native
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight extends EnumDWTFitWindowType
  /* 1 */ val enumFitWindowHeight: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindowHeight with Double = js.native
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth extends EnumDWTFitWindowType
  /* 2 */ val enumFitWindowWidth: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindowWidth with Double = js.native
}
