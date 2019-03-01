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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("displayAddOnCards")(displayAddOnCards)
    __obj.updateDynamic("setOpenLink")(setOpenLink)
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
}

