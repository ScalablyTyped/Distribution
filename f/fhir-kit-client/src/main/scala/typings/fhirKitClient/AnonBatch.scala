package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatch extends js.Object {
  var `type`: batch
}

object AnonBatch {
  @scala.inline
  def apply(`type`: batch): AnonBatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatch]
  }
}

