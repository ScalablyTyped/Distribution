package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Lists values specifying the page orientation.
  */
@JSGlobal("Orientation")
@js.native
object Orientation extends js.Object {
  /**
    * Worksheet page orientation is landscape.
    */
  @js.native
  sealed trait Landscape extends Orientation
  
  /**
    * Worksheet page orientation is portrait.
    */
  @js.native
  sealed trait Portrait extends Orientation
  
  /* 0 */ val Landscape: typings.devexpressDashWeb.Orientation.Landscape with Double = js.native
  /* 1 */ val Portrait: typings.devexpressDashWeb.Orientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

