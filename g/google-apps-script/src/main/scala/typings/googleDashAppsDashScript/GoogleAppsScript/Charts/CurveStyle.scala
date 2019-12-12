package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.CurveStyle.NORMAL
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.CurveStyle.SMOOTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurveStyle extends js.Object

/**
  * An enumeration of the styles for curves in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.CurveStyle")
@js.native
object CurveStyle extends js.Object {
  @js.native
  sealed trait NORMAL extends CurveStyle
  
  @js.native
  sealed trait SMOOTH extends CurveStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurveStyle with Double] = js.native
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 1 */ @js.native
  object SMOOTH extends TopLevel[SMOOTH with Double]
  
}

