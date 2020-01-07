package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for exporting to BigQuery.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1alpha2FhirBigQueryDestination extends js.Object {
  /**
    * BigQuery URI to a dataset, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId`
    */
  var datasetUri: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[Schema$SchemaConfig] = js.native
}

object Schema$GoogleCloudHealthcareV1alpha2FhirBigQueryDestination {
  @scala.inline
  def apply(datasetUri: String = null, schemaConfig: Schema$SchemaConfig = null): Schema$GoogleCloudHealthcareV1alpha2FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (datasetUri != null) __obj.updateDynamic("datasetUri")(datasetUri.asInstanceOf[js.Any])
    if (schemaConfig != null) __obj.updateDynamic("schemaConfig")(schemaConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1alpha2FhirBigQueryDestination]
  }
}

