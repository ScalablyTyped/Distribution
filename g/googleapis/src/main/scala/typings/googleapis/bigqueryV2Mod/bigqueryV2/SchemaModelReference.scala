package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Id path of a model.
  */
@js.native
trait SchemaModelReference extends js.Object {
  /**
    * [Required] The ID of the dataset containing this model.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the model. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024
    * characters.
    */
  var modelId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the project containing this model.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaModelReference {
  @scala.inline
  def apply(datasetId: String = null, modelId: String = null, projectId: String = null): SchemaModelReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModelReference]
  }
}

