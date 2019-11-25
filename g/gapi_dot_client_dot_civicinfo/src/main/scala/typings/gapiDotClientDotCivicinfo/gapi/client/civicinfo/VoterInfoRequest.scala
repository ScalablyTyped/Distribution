package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoterInfoRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.undefined
  var voterInfoSegmentResult: js.UndefOr[VoterInfoSegmentResult] = js.undefined
}

object VoterInfoRequest {
  @scala.inline
  def apply(contextParams: ContextParams = null, voterInfoSegmentResult: VoterInfoSegmentResult = null): VoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    if (voterInfoSegmentResult != null) __obj.updateDynamic("voterInfoSegmentResult")(voterInfoSegmentResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoterInfoRequest]
  }
}

