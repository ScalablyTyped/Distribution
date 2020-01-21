package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoscalerStatusDetails extends js.Object {
  /**
    * The status message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The type of error returned.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAutoscalerStatusDetails {
  @scala.inline
  def apply(message: String = null, `type`: String = null): SchemaAutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalerStatusDetails]
  }
}

