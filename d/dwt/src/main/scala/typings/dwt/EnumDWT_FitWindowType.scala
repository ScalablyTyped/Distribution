package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_FitWindowType extends js.Object

/** Fit window type */
@JSGlobal("EnumDWT_FitWindowType")
@js.native
object EnumDWT_FitWindowType extends js.Object {
  /** Fit the image to the width and height of the window */
  @js.native
  sealed trait enumFitWindow extends EnumDWT_FitWindowType
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight extends EnumDWT_FitWindowType
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth extends EnumDWT_FitWindowType
  
  /* 0 */ val enumFitWindow: typings.dwt.EnumDWT_FitWindowType.enumFitWindow with Double = js.native
  /* 1 */ val enumFitWindowHeight: typings.dwt.EnumDWT_FitWindowType.enumFitWindowHeight with Double = js.native
  /* 2 */ val enumFitWindowWidth: typings.dwt.EnumDWT_FitWindowType.enumFitWindowWidth with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_FitWindowType with Double] = js.native
}

