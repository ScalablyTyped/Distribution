package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSection extends js.Object {
  def addWidget(widget: Widget): CardSection
  def setCollapsible(collapsible: Boolean): CardSection
  def setHeader(header: String): CardSection
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: Integer): CardSection
}

object CardSection {
  @scala.inline
  def apply(
    addWidget: Widget => CardSection,
    setCollapsible: Boolean => CardSection,
    setHeader: String => CardSection,
    setNumUncollapsibleWidgets: Integer => CardSection
  ): CardSection = {
    val __obj = js.Dynamic.literal(addWidget = js.Any.fromFunction1(addWidget), setCollapsible = js.Any.fromFunction1(setCollapsible), setHeader = js.Any.fromFunction1(setHeader), setNumUncollapsibleWidgets = js.Any.fromFunction1(setNumUncollapsibleWidgets))
  
    __obj.asInstanceOf[CardSection]
  }
}

