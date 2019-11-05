package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for the UniversalActionResponse objects.
  */
trait UniversalActionResponseBuilder extends js.Object {
  def build(): UniversalActionResponse
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder
}

object UniversalActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => UniversalActionResponse,
    displayAddOnCards: js.Array[Card] => UniversalActionResponseBuilder,
    setOpenLink: OpenLink => UniversalActionResponseBuilder
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), displayAddOnCards = js.Any.fromFunction1(displayAddOnCards), setOpenLink = js.Any.fromFunction1(setOpenLink))
  
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
}

