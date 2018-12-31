package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogResponse extends DialogResponse {
  var amount: java.lang.String
  var currency: java.lang.String
  var payment_id: java.lang.String
  var quantity: java.lang.String
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var signed_request: java.lang.String
  var status: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.completed | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.initiated
}

