package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

/**
  * An enum representing the mode of travel to use when finding directions.
  */
@JSGlobal("GoogleAppsScript.Maps.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait BICYCLING extends Mode
  
  @js.native
  sealed trait DRIVING extends Mode
  
  @js.native
  sealed trait TRANSIT extends Mode
  
  @js.native
  sealed trait WALKING extends Mode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
  /* 2 */ @js.native
  object BICYCLING extends TopLevel[BICYCLING with Double]
  
  /* 0 */ @js.native
  object DRIVING extends TopLevel[DRIVING with Double]
  
  /* 3 */ @js.native
  object TRANSIT extends TopLevel[TRANSIT with Double]
  
  /* 1 */ @js.native
  object WALKING extends TopLevel[WALKING with Double]
  
}

