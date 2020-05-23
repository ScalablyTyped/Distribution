package typings.googleAppsScript.GoogleAppsScript.CardService

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
  
}

