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
    deleteListItem: () => scala.Unit,
    getDatePublished: () => stdLib.Date,
    getLastUpdated: () => stdLib.Date,
    getParent: () => Page,
    getValueByIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getValueByName: java.lang.String => java.lang.String,
    setParent: Page => ListItem,
    setValueByIndex: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String) => ListItem,
    setValueByName: (java.lang.String, java.lang.String) => ListItem
  ): ListItem = {
    val __obj = js.Dynamic.literal(deleteListItem = js.Any.fromFunction0(deleteListItem), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByName = js.Any.fromFunction1(getValueByName), setParent = js.Any.fromFunction1(setParent), setValueByIndex = js.Any.fromFunction2(setValueByIndex), setValueByName = js.Any.fromFunction2(setValueByName))
  
    __obj.asInstanceOf[ListItem]
  }
}

