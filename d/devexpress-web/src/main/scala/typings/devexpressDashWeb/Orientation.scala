package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Landscape extends Orientation
  
  @js.native
  sealed trait Portrait extends Orientation
  
  /* 0 */ val Landscape: typings.devexpressDashWeb.Orientation.Landscape with Double = js.native
  /* 1 */ val Portrait: typings.devexpressDashWeb.Orientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

