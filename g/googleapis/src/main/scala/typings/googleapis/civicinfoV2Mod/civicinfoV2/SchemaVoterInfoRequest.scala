package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for information about a voter.
  */
@js.native
trait SchemaVoterInfoRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
  var voterInfoSegmentResult: js.UndefOr[SchemaVoterInfoSegmentResult] = js.native
}

object SchemaVoterInfoRequest {
  @scala.inline
  def apply(
    contextParams: SchemaContextParams = null,
    voterInfoSegmentResult: SchemaVoterInfoSegmentResult = null
  ): SchemaVoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    if (voterInfoSegmentResult != null) __obj.updateDynamic("voterInfoSegmentResult")(voterInfoSegmentResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVoterInfoRequest]
  }
}

