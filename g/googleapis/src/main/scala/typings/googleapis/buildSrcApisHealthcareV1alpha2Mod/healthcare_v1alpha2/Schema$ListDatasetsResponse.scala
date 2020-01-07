package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the available datasets.
  */
@js.native
trait Schema$ListDatasetsResponse extends js.Object {
  /**
    * The first page of datasets.
    */
  var datasets: js.UndefOr[js.Array[Schema$Dataset]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDatasetsResponse {
  @scala.inline
  def apply(datasets: js.Array[Schema$Dataset] = null, nextPageToken: String = null): Schema$ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDatasetsResponse]
  }
}

