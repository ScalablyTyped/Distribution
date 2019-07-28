package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transaction extends js.Object {
  var `type`: transaction
}

object Anon_Transaction {
  @scala.inline
  def apply(`type`: transaction): Anon_Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Transaction]
  }
}

