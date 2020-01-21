package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.history
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistory extends js.Object {
  var `type`: history
}

object AnonHistory {
  @scala.inline
  def apply(`type`: history): AnonHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHistory]
  }
}

