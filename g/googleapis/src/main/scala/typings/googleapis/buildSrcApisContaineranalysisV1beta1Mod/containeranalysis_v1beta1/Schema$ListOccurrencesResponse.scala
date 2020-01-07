package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing occurrences.
  */
@js.native
trait Schema$ListOccurrencesResponse extends js.Object {
  /**
    * The next pagination token in the list response. It should be used as
    * `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences requested.
    */
  var occurrences: js.UndefOr[js.Array[Schema$Occurrence]] = js.native
}

object Schema$ListOccurrencesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, occurrences: js.Array[Schema$Occurrence] = null): Schema$ListOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListOccurrencesResponse]
  }
}

