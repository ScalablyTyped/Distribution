package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse extends js.Object {
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.native
  /**
    * The FHIR store name the resources have been imported to, in the format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse {
  @scala.inline
  def apply(
    errorCount: String = null,
    inputSize: String = null,
    name: String = null,
    successCount: String = null
  ): Schema$GoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (inputSize != null) __obj.updateDynamic("inputSize")(inputSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse]
  }
}

