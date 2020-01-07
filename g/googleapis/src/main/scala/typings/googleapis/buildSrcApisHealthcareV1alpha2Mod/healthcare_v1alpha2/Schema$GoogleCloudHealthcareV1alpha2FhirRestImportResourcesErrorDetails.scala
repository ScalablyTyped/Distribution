package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error response of importing resources. This structure will be included in
  * the error details to describe the detailed error. It will only be included
  * when the operation finishes with some failure.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails extends js.Object {
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * The name of the FHIR store where resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.native
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails {
  @scala.inline
  def apply(
    errorCount: String = null,
    fhirStore: String = null,
    inputSize: String = null,
    successCount: String = null
  ): Schema$GoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (fhirStore != null) __obj.updateDynamic("fhirStore")(fhirStore.asInstanceOf[js.Any])
    if (inputSize != null) __obj.updateDynamic("inputSize")(inputSize.asInstanceOf[js.Any])
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails]
  }
}

