package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFitWindowType extends js.Object
/** Fit window type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FitWindowType")
@js.native
object EnumDWTFitWindowType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFitWindowType with Double] = js.native
  
  /** Fit the image to the width and height of the window */
  @js.native
  sealed trait enumFitWindow extends EnumDWTFitWindowType
  /* 0 */ @js.native
  object enumFitWindow extends TopLevel[enumFitWindow with Double]
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight extends EnumDWTFitWindowType
  /* 1 */ @js.native
  object enumFitWindowHeight extends TopLevel[enumFitWindowHeight with Double]
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth extends EnumDWTFitWindowType
  /* 2 */ @js.native
  object enumFitWindowWidth extends TopLevel[enumFitWindowWidth with Double]
}
