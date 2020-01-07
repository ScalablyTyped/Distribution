package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for information about a voter.
  */
@js.native
trait Schema$VoterInfoRequest extends js.Object {
  var contextParams: js.UndefOr[Schema$ContextParams] = js.native
  var voterInfoSegmentResult: js.UndefOr[Schema$VoterInfoSegmentResult] = js.native
}

object Schema$VoterInfoRequest {
  @scala.inline
  def apply(
    contextParams: Schema$ContextParams = null,
    voterInfoSegmentResult: Schema$VoterInfoSegmentResult = null
  ): Schema$VoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    if (voterInfoSegmentResult != null) __obj.updateDynamic("voterInfoSegmentResult")(voterInfoSegmentResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VoterInfoRequest]
  }
}

