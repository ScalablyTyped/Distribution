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
    build: js.Function0[UniversalActionResponse],
    displayAddOnCards: js.Function1[js.Array[js.Object], UniversalActionResponseBuilder],
    setOpenLink: js.Function1[OpenLink, UniversalActionResponseBuilder]
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build, displayAddOnCards = displayAddOnCards, setOpenLink = setOpenLink)
  
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
}

