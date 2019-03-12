package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetTrackingTemplate extends js.Object {
  def setCustomParameters(customParameters: js.Object): scala.Unit
  def setTrackingTemplate(trackingTemplate: java.lang.String): scala.Unit
}

object hasSetTrackingTemplate {
  @scala.inline
  def apply(setCustomParameters: js.Object => scala.Unit, setTrackingTemplate: java.lang.String => scala.Unit): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
}

