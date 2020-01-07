package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new message.
  */
@js.native
trait Schema$CreateMessageRequest extends js.Object {
  /**
    * HL7v2 message.
    */
  var message: js.UndefOr[Schema$Message] = js.native
}

object Schema$CreateMessageRequest {
  @scala.inline
  def apply(message: Schema$Message = null): Schema$CreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateMessageRequest]
  }
}

