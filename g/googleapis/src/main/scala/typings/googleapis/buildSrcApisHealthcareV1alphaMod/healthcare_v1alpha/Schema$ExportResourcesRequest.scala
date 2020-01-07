package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to export resources.
  */
@js.native
trait Schema$ExportResourcesRequest extends js.Object {
  /**
    * The BigQuery destination location. The output will be one BigQuery table
    * per resource type.
    */
  var bigqueryDestinationLocation: js.UndefOr[Schema$BigQueryLocation] = js.native
  /**
    * The Cloud Storage destination location. Specify a path to a Cloud Storage
    * bucket or folder rather than a concrete object. The exported outputs are
    * organized by FHIR resource types. The server will create one object per
    * resource type. Each object contains newline delimited JSON, and each line
    * is a FHIR resource.
    */
  var gcsDestinationLocation: js.UndefOr[Schema$GcsDataLocation] = js.native
}

object Schema$ExportResourcesRequest {
  @scala.inline
  def apply(
    bigqueryDestinationLocation: Schema$BigQueryLocation = null,
    gcsDestinationLocation: Schema$GcsDataLocation = null
  ): Schema$ExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestinationLocation != null) __obj.updateDynamic("bigqueryDestinationLocation")(bigqueryDestinationLocation.asInstanceOf[js.Any])
    if (gcsDestinationLocation != null) __obj.updateDynamic("gcsDestinationLocation")(gcsDestinationLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExportResourcesRequest]
  }
}

