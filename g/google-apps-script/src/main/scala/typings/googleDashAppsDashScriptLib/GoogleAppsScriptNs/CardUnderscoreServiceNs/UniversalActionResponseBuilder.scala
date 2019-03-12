package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalActionResponseBuilder extends js.Object {
  def build(): UniversalActionResponse
  def displayAddOnCards(cardObjects: js.Array[js.Object]): UniversalActionResponseBuilder
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder
}

object UniversalActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => UniversalActionResponse,
    displayAddOnCards: js.Array[js.Object] => UniversalActionResponseBuilder,
    setOpenLink: OpenLink => UniversalActionResponseBuilder
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), displayAddOnCards = js.Any.fromFunction1(displayAddOnCards), setOpenLink = js.Any.fromFunction1(setOpenLink))
  
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
}

