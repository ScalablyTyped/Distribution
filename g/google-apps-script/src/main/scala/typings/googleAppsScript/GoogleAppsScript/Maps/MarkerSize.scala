package typings.googleAppsScript.GoogleAppsScript.Maps

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
  
}

