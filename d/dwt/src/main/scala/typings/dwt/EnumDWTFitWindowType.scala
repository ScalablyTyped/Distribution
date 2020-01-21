package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTFitWindowType extends js.Object

/** Fit window type */
@JSGlobal("EnumDWT_FitWindowType")
@js.native
object EnumDWTFitWindowType extends js.Object {
  /** Fit the image to the width and height of the window */
  @js.native
  sealed trait enumFitWindow extends EnumDWTFitWindowType
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight extends EnumDWTFitWindowType
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth extends EnumDWTFitWindowType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFitWindowType with Double] = js.native
  /* 0 */ @js.native
  object enumFitWindow extends TopLevel[enumFitWindow with Double]
  
  /* 1 */ @js.native
  object enumFitWindowHeight extends TopLevel[enumFitWindowHeight with Double]
  
  /* 2 */ @js.native
  object enumFitWindowWidth extends TopLevel[enumFitWindowWidth with Double]
  
}

