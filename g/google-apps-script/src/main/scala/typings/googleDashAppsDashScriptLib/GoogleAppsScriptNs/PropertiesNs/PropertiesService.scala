package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PropertiesNs

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
    getDocumentProperties: js.Function0[Properties],
    getScriptProperties: js.Function0[Properties],
    getUserProperties: js.Function0[Properties]
  ): PropertiesService = {
    val __obj = js.Dynamic.literal(getDocumentProperties = getDocumentProperties, getScriptProperties = getScriptProperties, getUserProperties = getUserProperties)
  
    __obj.asInstanceOf[PropertiesService]
  }
}

