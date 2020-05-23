package typings.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Avoid extends js.Object

/**
  * An enum representing the types of restrictions to avoid when finding directions.
  */
@JSGlobal("GoogleAppsScript.Maps.Avoid")
@js.native
object Avoid extends js.Object {
  @js.native
  sealed trait HIGHWAYS extends Avoid
  
  @js.native
  sealed trait TOLLS extends Avoid
  
}

