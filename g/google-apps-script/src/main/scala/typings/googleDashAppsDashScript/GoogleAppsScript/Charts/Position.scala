package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

/**
  * An enumeration of legend positions within a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM extends Position
  
  @js.native
  sealed trait NONE extends Position
  
  @js.native
  sealed trait RIGHT extends Position
  
  @js.native
  sealed trait TOP extends Position
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  /* 2 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  /* 3 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  /* 0 */ @js.native
  object TOP extends TopLevel[TOP with Double]
  
}

