package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.native
  var request: js.UndefOr[SchemaVoterInfoRequest] = js.native
  var response: js.UndefOr[SchemaVoterInfoResponse] = js.native
}

object SchemaVoterInfoSegmentResult {
  @scala.inline
  def apply(
    generatedMillis: String = null,
    postalAddress: SchemaPostalAddress = null,
    request: SchemaVoterInfoRequest = null,
    response: SchemaVoterInfoResponse = null
  ): SchemaVoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    if (generatedMillis != null) __obj.updateDynamic("generatedMillis")(generatedMillis.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVoterInfoSegmentResult]
  }
}

