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
  def apply[B](
    withCustomParameters: js.Function1[js.Object, B],
    withTrackingTemplate: js.Function1[java.lang.String, B]
  ): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = withCustomParameters, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
}

