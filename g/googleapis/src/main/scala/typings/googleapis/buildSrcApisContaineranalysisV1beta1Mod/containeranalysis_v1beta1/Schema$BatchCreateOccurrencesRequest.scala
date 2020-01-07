package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create occurrences in batch.
  */
@js.native
trait Schema$BatchCreateOccurrencesRequest extends js.Object {
  /**
    * The occurrences to create. Max allowed length is 1000.
    */
  var occurrences: js.UndefOr[js.Array[Schema$Occurrence]] = js.native
}

object Schema$BatchCreateOccurrencesRequest {
  @scala.inline
  def apply(occurrences: js.Array[Schema$Occurrence] = null): Schema$BatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreateOccurrencesRequest]
  }
}

