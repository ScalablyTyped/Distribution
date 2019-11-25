package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetReference extends js.Object {
  /**
    * [Required] A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The
    * maximum length is 1,024 characters.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  /** [Optional] The ID of the project containing this dataset. */
  var projectId: js.UndefOr[String] = js.undefined
}

object DatasetReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null): DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetReference]
  }
}

