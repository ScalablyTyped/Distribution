package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesService extends js.Object {
  def getDocumentProperties(): Properties
  def getScriptProperties(): Properties
  def getUserProperties(): Properties
}

object PropertiesService {
  @scala.inline
  def apply(
    getDocumentProperties: () => Properties,
    getScriptProperties: () => Properties,
    getUserProperties: () => Properties
  ): PropertiesService = {
    val __obj = js.Dynamic.literal(getDocumentProperties = js.Any.fromFunction0(getDocumentProperties), getScriptProperties = js.Any.fromFunction0(getScriptProperties), getUserProperties = js.Any.fromFunction0(getUserProperties))
  
    __obj.asInstanceOf[PropertiesService]
  }
}

