package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadIndicator extends js.Object

/**
  * An enum type that specifies the type of loading or progress indicator to display while an Action is being processed.
  */
@JSGlobal("GoogleAppsScript.Card_Service.LoadIndicator")
@js.native
object LoadIndicator extends js.Object {
  @js.native
  sealed trait NONE extends LoadIndicator
  
  @js.native
  sealed trait SPINNER extends LoadIndicator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoadIndicator with Double] = js.native
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 0 */ @js.native
  object SPINNER extends TopLevel[SPINNER with Double]
  
}

