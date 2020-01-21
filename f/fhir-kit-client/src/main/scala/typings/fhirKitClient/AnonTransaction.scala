package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransaction extends js.Object {
  var `type`: transaction
}

object AnonTransaction {
  @scala.inline
  def apply(`type`: transaction): AnonTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransaction]
  }
}

