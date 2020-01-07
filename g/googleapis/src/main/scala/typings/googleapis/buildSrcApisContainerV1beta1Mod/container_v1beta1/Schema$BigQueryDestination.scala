package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for using BigQuery as the destination of resource usage export.
  */
@js.native
trait Schema$BigQueryDestination extends js.Object {
  /**
    * The ID of a BigQuery Dataset.
    */
  var datasetId: js.UndefOr[String] = js.native
}

object Schema$BigQueryDestination {
  @scala.inline
  def apply(datasetId: String = null): Schema$BigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BigQueryDestination]
  }
}

