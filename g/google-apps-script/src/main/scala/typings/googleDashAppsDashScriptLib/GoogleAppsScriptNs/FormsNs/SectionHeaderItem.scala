package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionHeaderItem extends js.Object {
  def duplicate(): SectionHeaderItem
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def setHelpText(text: java.lang.String): SectionHeaderItem
  def setTitle(title: java.lang.String): SectionHeaderItem
}

object SectionHeaderItem {
  @scala.inline
  def apply(
    duplicate: js.Function0[SectionHeaderItem],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    setHelpText: js.Function1[java.lang.String, SectionHeaderItem],
    setTitle: js.Function1[java.lang.String, SectionHeaderItem]
  ): SectionHeaderItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[SectionHeaderItem]
  }
}

