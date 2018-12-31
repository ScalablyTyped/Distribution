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

