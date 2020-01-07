package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for creating occurrences in batch.
  */
@js.native
trait Schema$BatchCreateOccurrencesResponse extends js.Object {
  /**
    * The occurrences that were created.
    */
  var occurrences: js.UndefOr[js.Array[Schema$Occurrence]] = js.native
}

object Schema$BatchCreateOccurrencesResponse {
  @scala.inline
  def apply(occurrences: js.Array[Schema$Occurrence] = null): Schema$BatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreateOccurrencesResponse]
  }
}

