package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BigQuery dataset location.
  */
@js.native
trait Schema$BigQueryLocation extends js.Object {
  /**
    * ID of the dataset that houses the BigQuery tables.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the BigQuery datasets.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[Schema$SchemaConfig] = js.native
}

object Schema$BigQueryLocation {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, schemaConfig: Schema$SchemaConfig = null): Schema$BigQueryLocation = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (schemaConfig != null) __obj.updateDynamic("schemaConfig")(schemaConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BigQueryLocation]
  }
}

