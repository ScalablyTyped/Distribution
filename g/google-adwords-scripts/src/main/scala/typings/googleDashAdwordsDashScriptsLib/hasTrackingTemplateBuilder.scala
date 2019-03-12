package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasTrackingTemplateBuilder[B] extends js.Object {
  def withCustomParameters(customParameters: js.Object): B
  def withTrackingTemplate(trackingTemplate: java.lang.String): B
}

object hasTrackingTemplateBuilder {
  @scala.inline
  def apply[B](withCustomParameters: js.Object => B, withTrackingTemplate: java.lang.String => B): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = js.Any.fromFunction1(withCustomParameters), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
}

