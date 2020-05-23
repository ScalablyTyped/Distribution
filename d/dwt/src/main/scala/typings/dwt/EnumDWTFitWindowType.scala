package typings.dwt

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
  
}

