package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetTrackingTemplate extends js.Object {
  def setCustomParameters(customParameters: js.Object): Unit
  def setTrackingTemplate(trackingTemplate: String): Unit
}

object hasSetTrackingTemplate {
  @scala.inline
  def apply(setCustomParameters: js.Object => Unit, setTrackingTemplate: String => Unit): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
}

