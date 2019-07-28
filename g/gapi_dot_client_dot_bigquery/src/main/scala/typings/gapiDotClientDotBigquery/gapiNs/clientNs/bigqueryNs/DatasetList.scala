package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import typings.gapiDotClientDotBigquery.Anon_DatasetReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetList extends js.Object {
  /**
    * An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource,
    * use the Datasets: get method. This property is omitted when there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[Anon_DatasetReference]] = js.undefined
  /** A hash value of the results page. You can use this property to determine if the page has changed since the last request. */
  var etag: js.UndefOr[String] = js.undefined
  /** The list type. This property always returns the value "bigquery#datasetList". */
  var kind: js.UndefOr[String] = js.undefined
  /** A token that can be used to request the next results page. This property is omitted on the final results page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DatasetList {
  @scala.inline
  def apply(
    datasets: js.Array[Anon_DatasetReference] = null,
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

