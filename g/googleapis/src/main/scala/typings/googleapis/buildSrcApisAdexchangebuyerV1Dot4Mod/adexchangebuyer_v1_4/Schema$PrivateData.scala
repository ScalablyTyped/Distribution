package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PrivateData extends js.Object {
  var referenceId: js.UndefOr[String] = js.native
  var referencePayload: js.UndefOr[String] = js.native
}

object Schema$PrivateData {
  @scala.inline
  def apply(referenceId: String = null, referencePayload: String = null): Schema$PrivateData = {
    val __obj = js.Dynamic.literal()
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (referencePayload != null) __obj.updateDynamic("referencePayload")(referencePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PrivateData]
  }
}

