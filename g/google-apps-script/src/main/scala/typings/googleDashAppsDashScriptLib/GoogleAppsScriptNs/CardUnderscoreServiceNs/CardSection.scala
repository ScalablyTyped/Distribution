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
    addWidget: Widget => CardSection,
    setCollapsible: scala.Boolean => CardSection,
    setHeader: java.lang.String => CardSection,
    setNumUncollapsibleWidgets: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CardSection
  ): CardSection = {
    val __obj = js.Dynamic.literal(addWidget = js.Any.fromFunction1(addWidget), setCollapsible = js.Any.fromFunction1(setCollapsible), setHeader = js.Any.fromFunction1(setHeader), setNumUncollapsibleWidgets = js.Any.fromFunction1(setNumUncollapsibleWidgets))
  
    __obj.asInstanceOf[CardSection]
  }
}

