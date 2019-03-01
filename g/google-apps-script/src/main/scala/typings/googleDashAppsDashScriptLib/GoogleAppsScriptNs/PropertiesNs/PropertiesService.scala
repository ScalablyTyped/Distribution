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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentProperties")(getDocumentProperties)
    __obj.updateDynamic("getScriptProperties")(getScriptProperties)
    __obj.updateDynamic("getUserProperties")(getUserProperties)
    __obj.asInstanceOf[PropertiesService]
  }
}

