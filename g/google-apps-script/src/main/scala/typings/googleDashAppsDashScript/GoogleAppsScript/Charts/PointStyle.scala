package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointStyle extends js.Object

/**
  * An enumeration of the styles of points in a line.
  */
@JSGlobal("GoogleAppsScript.Charts.PointStyle")
@js.native
object PointStyle extends js.Object {
  @js.native
  sealed trait HUGE extends PointStyle
  
  @js.native
  sealed trait LARGE extends PointStyle
  
  @js.native
  sealed trait MEDIUM extends PointStyle
  
  @js.native
  sealed trait NONE extends PointStyle
  
  @js.native
  sealed trait TINY extends PointStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointStyle with Double] = js.native
  /* 4 */ @js.native
  object HUGE extends TopLevel[HUGE with Double]
  
  /* 3 */ @js.native
  object LARGE extends TopLevel[LARGE with Double]
  
  /* 2 */ @js.native
  object MEDIUM extends TopLevel[MEDIUM with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object TINY extends TopLevel[TINY with Double]
  
}

