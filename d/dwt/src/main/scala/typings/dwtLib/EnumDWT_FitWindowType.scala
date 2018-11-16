package typings
package dwtLib

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
  sealed trait enumFitWindow
    extends dwtLib.EnumDWT_FitWindowType
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight
    extends dwtLib.EnumDWT_FitWindowType
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth
    extends dwtLib.EnumDWT_FitWindowType
  
  /* 0 */ val enumFitWindow: enumFitWindow with scala.Double = js.native
  /* 1 */ val enumFitWindowHeight: enumFitWindowHeight with scala.Double = js.native
  /* 2 */ val enumFitWindowWidth: enumFitWindowWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_FitWindowType with scala.Double] = js.native
}

