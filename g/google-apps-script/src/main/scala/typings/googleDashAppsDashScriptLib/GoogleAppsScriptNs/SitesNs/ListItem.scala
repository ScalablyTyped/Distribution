package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  def deleteListItem(): scala.Unit
  def getDatePublished(): stdLib.Date
  def getLastUpdated(): stdLib.Date
  def getParent(): Page
  def getValueByIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getValueByName(name: java.lang.String): java.lang.String
  def setParent(parent: Page): ListItem
  def setValueByIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, value: java.lang.String): ListItem
  def setValueByName(name: java.lang.String, value: java.lang.String): ListItem
}

object ListItem {
  @scala.inline
  def apply(
    deleteListItem: js.Function0[scala.Unit],
    getDatePublished: js.Function0[stdLib.Date],
    getLastUpdated: js.Function0[stdLib.Date],
    getParent: js.Function0[Page],
    getValueByIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getValueByName: js.Function1[java.lang.String, java.lang.String],
    setParent: js.Function1[Page, ListItem],
    setValueByIndex: js.Function2[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String, ListItem],
    setValueByName: js.Function2[java.lang.String, java.lang.String, ListItem]
  ): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteListItem")(deleteListItem)
    __obj.updateDynamic("getDatePublished")(getDatePublished)
    __obj.updateDynamic("getLastUpdated")(getLastUpdated)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getValueByIndex")(getValueByIndex)
    __obj.updateDynamic("getValueByName")(getValueByName)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setValueByIndex")(setValueByIndex)
    __obj.updateDynamic("setValueByName")(setValueByName)
    __obj.asInstanceOf[ListItem]
  }
}

