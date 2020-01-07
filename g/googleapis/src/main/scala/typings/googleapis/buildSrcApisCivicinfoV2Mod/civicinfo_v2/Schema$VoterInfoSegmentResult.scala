package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[Schema$PostalAddress] = js.native
  var request: js.UndefOr[Schema$VoterInfoRequest] = js.native
  var response: js.UndefOr[Schema$VoterInfoResponse] = js.native
}

object Schema$VoterInfoSegmentResult {
  @scala.inline
  def apply(
    generatedMillis: String = null,
    postalAddress: Schema$PostalAddress = null,
    request: Schema$VoterInfoRequest = null,
    response: Schema$VoterInfoResponse = null
  ): Schema$VoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    if (generatedMillis != null) __obj.updateDynamic("generatedMillis")(generatedMillis.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VoterInfoSegmentResult]
  }
}

