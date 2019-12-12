package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.SelectionInputType.CHECK_BOX
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.SelectionInputType.DROPDOWN
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.SelectionInputType.RADIO_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionInputType extends js.Object

/**
  * Type of selection input.
  */
@JSGlobal("GoogleAppsScript.Card_Service.SelectionInputType")
@js.native
object SelectionInputType extends js.Object {
  @js.native
  sealed trait CHECK_BOX extends SelectionInputType
  
  @js.native
  sealed trait DROPDOWN extends SelectionInputType
  
  @js.native
  sealed trait RADIO_BUTTON extends SelectionInputType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionInputType with Double] = js.native
  /* 0 */ @js.native
  object CHECK_BOX extends TopLevel[CHECK_BOX with Double]
  
  /* 2 */ @js.native
  object DROPDOWN extends TopLevel[DROPDOWN with Double]
  
  /* 1 */ @js.native
  object RADIO_BUTTON extends TopLevel[RADIO_BUTTON with Double]
  
}

