package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.`batch-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchresponse extends js.Object {
  var `type`: `batch-response`
}

object AnonBatchresponse {
  @scala.inline
  def apply(`type`: `batch-response`): AnonBatchresponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchresponse]
  }
}

