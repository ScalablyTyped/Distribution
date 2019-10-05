package typings.googleDashAppsDashScript.GoogleAppsScript.Properties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesService extends js.Object {
  def getDocumentProperties(): typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties
  def getScriptProperties(): typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties
  def getUserProperties(): typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties
}

object PropertiesService {
  @scala.inline
  def apply(
    getDocumentProperties: () => typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties,
    getScriptProperties: () => typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties,
    getUserProperties: () => typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties
  ): PropertiesService = {
    val __obj = js.Dynamic.literal(getDocumentProperties = js.Any.fromFunction0(getDocumentProperties), getScriptProperties = js.Any.fromFunction0(getScriptProperties), getUserProperties = js.Any.fromFunction0(getUserProperties))
  
    __obj.asInstanceOf[PropertiesService]
  }
}

