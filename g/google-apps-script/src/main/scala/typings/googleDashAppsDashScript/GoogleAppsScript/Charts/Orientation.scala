package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * An enumeration of the orientation of an object.
  */
@JSGlobal("GoogleAppsScript.Charts.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends Orientation
  
  @js.native
  sealed trait VERTICAL extends Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 0 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  /* 1 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
  
}

