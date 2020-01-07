package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ingests a message into the specified HL7v2 store.
  */
@js.native
trait Schema$IngestMessageRequest extends js.Object {
  /**
    * HL7v2 message to ingest.
    */
  var message: js.UndefOr[Schema$Message] = js.native
}

object Schema$IngestMessageRequest {
  @scala.inline
  def apply(message: Schema$Message = null): Schema$IngestMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IngestMessageRequest]
  }
}

