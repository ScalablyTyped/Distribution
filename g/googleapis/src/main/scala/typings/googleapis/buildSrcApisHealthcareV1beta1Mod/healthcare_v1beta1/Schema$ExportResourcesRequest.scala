package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to export resources.
  */
@js.native
trait Schema$ExportResourcesRequest extends js.Object {
  /**
    * The BigQuery output destination.  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.  The
    * output will be one BigQuery table per resource type.
    */
  var bigqueryDestination: js.UndefOr[Schema$GoogleCloudHealthcareV1beta1FhirBigQueryDestination] = js.native
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.  The exported
    * outputs are organized by FHIR resource types. The server will create one
    * object per resource type. Each object contains newline delimited JSON,
    * and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[Schema$GoogleCloudHealthcareV1beta1FhirRestGcsDestination] = js.native
}

object Schema$ExportResourcesRequest {
  @scala.inline
  def apply(
    bigqueryDestination: Schema$GoogleCloudHealthcareV1beta1FhirBigQueryDestination = null,
    gcsDestination: Schema$GoogleCloudHealthcareV1beta1FhirRestGcsDestination = null
  ): Schema$ExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestination != null) __obj.updateDynamic("bigqueryDestination")(bigqueryDestination.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExportResourcesRequest]
  }
}

