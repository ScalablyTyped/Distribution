package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of how many vulnz occurrences there are per severity type. counts
  * by groups, or if we should have different summary messages like this.
  */
@js.native
trait Schema$GetVulnzOccurrencesSummaryResponse extends js.Object {
  /**
    * A map of how many occurrences were found for each severity.
    */
  var counts: js.UndefOr[js.Array[Schema$SeverityCount]] = js.native
}

object Schema$GetVulnzOccurrencesSummaryResponse {
  @scala.inline
  def apply(counts: js.Array[Schema$SeverityCount] = null): Schema$GetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetVulnzOccurrencesSummaryResponse]
  }
}

