package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatasetReference extends js.Object {
  /**
    * [Required] A unique ID for this dataset, without the project name. The ID
    * must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
    * The maximum length is 1,024 characters.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Optional] The ID of the project containing this dataset.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaDatasetReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null): SchemaDatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatasetReference]
  }
}

