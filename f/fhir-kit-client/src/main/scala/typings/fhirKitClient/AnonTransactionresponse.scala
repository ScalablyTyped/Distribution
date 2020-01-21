package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.`transaction-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransactionresponse extends js.Object {
  var `type`: `transaction-response`
}

object AnonTransactionresponse {
  @scala.inline
  def apply(`type`: `transaction-response`): AnonTransactionresponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransactionresponse]
  }
}

