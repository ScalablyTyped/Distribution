package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location(s) to which data should be exported.
  */
@js.native
trait Schema$OutputConfig extends js.Object {
  /**
    * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor`
    * and `roles/bigquery.jobUser`.
    */
  var bigQueryDestination: js.UndefOr[Schema$BigQueryDestination] = js.native
  /**
    * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note
    * that writing a file to the same destination multiple times will result in
    * the previous version of the file being overwritten.
    */
  var gcsDestination: js.UndefOr[Schema$GcsDestination] = js.native
}

object Schema$OutputConfig {
  @scala.inline
  def apply(
    bigQueryDestination: Schema$BigQueryDestination = null,
    gcsDestination: Schema$GcsDestination = null
  ): Schema$OutputConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryDestination != null) __obj.updateDynamic("bigQueryDestination")(bigQueryDestination.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OutputConfig]
  }
}

