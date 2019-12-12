package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashWeb.Orientation.Landscape
import typings.devexpressDashWeb.Orientation.Portrait
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 0 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  /* 1 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
}

