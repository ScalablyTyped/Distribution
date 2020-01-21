package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonDatasetReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatasetList extends js.Object {
  /**
    * An array of the dataset resources in the project. Each resource contains
    * basic information. For full information about a particular dataset
    * resource, use the Datasets: get method. This property is omitted when
    * there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[AnonDatasetReference]] = js.native
  /**
    * A hash value of the results page. You can use this property to determine
    * if the page has changed since the last request.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list type. This property always returns the value
    * &quot;bigquery#datasetList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token that can be used to request the next results page. This property
    * is omitted on the final results page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDatasetList {
  @scala.inline
  def apply(
    datasets: js.Array[AnonDatasetReference] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaDatasetList = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatasetList]
  }
}

