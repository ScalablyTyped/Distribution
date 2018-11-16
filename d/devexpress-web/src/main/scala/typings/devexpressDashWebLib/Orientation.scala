package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Landscape
    extends devexpressDashWebLib.Orientation
  
  @js.native
  sealed trait Portrait
    extends devexpressDashWebLib.Orientation
  
  /* 0 */ val Landscape: Landscape with scala.Double = js.native
  /* 1 */ val Portrait: Portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.Orientation with scala.Double] = js.native
}

