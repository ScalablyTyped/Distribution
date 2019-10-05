package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetList extends js.Object {
  var datasets: js.UndefOr[js.Array[DatasetListDatasets]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DatasetList {
  @scala.inline
  def apply(
    datasets: js.Array[DatasetListDatasets] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): DatasetList = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DatasetList]
  }
}

