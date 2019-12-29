package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Avoid with Double] = js.native
  /* 1 */ @js.native
  object HIGHWAYS extends TopLevel[HIGHWAYS with Double]
  
  /* 0 */ @js.native
  object TOLLS extends TopLevel[TOLLS with Double]
  
}

