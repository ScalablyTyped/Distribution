package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes successfully.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1beta1FhirRestImportResourcesResponse extends js.Object {
  /**
    * The name of the FHIR store where the resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  /**
    * The total number of resources included in the source data.
    */
  var inputSize: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudHealthcareV1beta1FhirRestImportResourcesResponse {
  @scala.inline
  def apply(fhirStore: String = null, inputSize: String = null): Schema$GoogleCloudHealthcareV1beta1FhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (fhirStore != null) __obj.updateDynamic("fhirStore")(fhirStore.asInstanceOf[js.Any])
    if (inputSize != null) __obj.updateDynamic("inputSize")(inputSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1beta1FhirRestImportResourcesResponse]
  }
}

