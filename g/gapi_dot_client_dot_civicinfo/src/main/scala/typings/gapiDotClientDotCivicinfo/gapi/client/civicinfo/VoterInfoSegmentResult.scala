package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.undefined
  var postalAddress: js.UndefOr[PostalAddress] = js.undefined
  var request: js.UndefOr[VoterInfoRequest] = js.undefined
  var response: js.UndefOr[VoterInfoResponse] = js.undefined
}

object VoterInfoSegmentResult {
  @scala.inline
  def apply(
    generatedMillis: String = null,
    postalAddress: PostalAddress = null,
    request: VoterInfoRequest = null,
    response: VoterInfoResponse = null
  ): VoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    if (generatedMillis != null) __obj.updateDynamic("generatedMillis")(generatedMillis.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoterInfoSegmentResult]
  }
}

