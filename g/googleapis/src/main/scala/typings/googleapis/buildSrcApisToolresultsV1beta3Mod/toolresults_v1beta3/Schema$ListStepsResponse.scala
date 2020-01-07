package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for StepService.List.
  */
@js.native
trait Schema$ListStepsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more steps to read, by calling list again with
    * this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Steps.
    */
  var steps: js.UndefOr[js.Array[Schema$Step]] = js.native
}

object Schema$ListStepsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, steps: js.Array[Schema$Step] = null): Schema$ListStepsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListStepsResponse]
  }
}

