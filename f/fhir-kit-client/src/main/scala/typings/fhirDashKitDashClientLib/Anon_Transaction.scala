package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transaction extends js.Object {
  var `type`: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.transaction
}

object Anon_Transaction {
  @scala.inline
  def apply(`type`: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.transaction): Anon_Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Transaction]
  }
}

