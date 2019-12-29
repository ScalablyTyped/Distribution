package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSize extends js.Object

/**
  * An enum representing the size of a marker added to a map.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
@js.native
object MarkerSize extends js.Object {
  @js.native
  sealed trait MID extends MarkerSize
  
  @js.native
  sealed trait SMALL extends MarkerSize
  
  @js.native
  sealed trait TINY extends MarkerSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSize with Double] = js.native
  /* 1 */ @js.native
  object MID extends TopLevel[MID with Double]
  
  /* 2 */ @js.native
  object SMALL extends TopLevel[SMALL with Double]
  
  /* 0 */ @js.native
  object TINY extends TopLevel[TINY with Double]
  
}

