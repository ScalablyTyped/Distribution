package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response of auto-complete query.
  */
@js.native
trait Schema$CompleteQueryResponse extends js.Object {
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[Schema$CompletionResult]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[Schema$ResponseMetadata] = js.native
}

object Schema$CompleteQueryResponse {
  @scala.inline
  def apply(
    completionResults: js.Array[Schema$CompletionResult] = null,
    metadata: Schema$ResponseMetadata = null
  ): Schema$CompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (completionResults != null) __obj.updateDynamic("completionResults")(completionResults.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompleteQueryResponse]
  }
}

