package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateData extends js.Object {
  var referenceId: js.UndefOr[String] = js.undefined
  var referencePayload: js.UndefOr[String] = js.undefined
}

object PrivateData {
  @scala.inline
  def apply(referenceId: String = null, referencePayload: String = null): PrivateData = {
    val __obj = js.Dynamic.literal()
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (referencePayload != null) __obj.updateDynamic("referencePayload")(referencePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateData]
  }
}

