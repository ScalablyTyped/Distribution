package typings.googleAppsScript.GoogleAppsScript.Maps

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
  
}

