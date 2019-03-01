package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSection extends js.Object {
  def addWidget(widget: Widget): CardSection
  def setCollapsible(collapsible: scala.Boolean): CardSection
  def setHeader(header: java.lang.String): CardSection
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CardSection
}

object CardSection {
  @scala.inline
  def apply(
    addWidget: js.Function1[Widget, CardSection],
    setCollapsible: js.Function1[scala.Boolean, CardSection],
    setHeader: js.Function1[java.lang.String, CardSection],
    setNumUncollapsibleWidgets: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CardSection]
  ): CardSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addWidget")(addWidget)
    __obj.updateDynamic("setCollapsible")(setCollapsible)
    __obj.updateDynamic("setHeader")(setHeader)
    __obj.updateDynamic("setNumUncollapsibleWidgets")(setNumUncollapsibleWidgets)
    __obj.asInstanceOf[CardSection]
  }
}

