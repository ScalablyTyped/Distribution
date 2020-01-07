package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location(s) from which data should be imported.
  */
@js.native
trait Schema$InputConfig extends js.Object {
  /**
    * Files on Google Cloud Storage. To enable the Cloud Healthcare API to read
    * from resources in your project (e.g. Google Cloud Storage buckets), you
    * must give the consumer Cloud Healthcare API service account the proper
    * permissions. The service account is:
    * `service-{PROJECT_NUMBER}@gcp-sa-healthcare.iam.gserviceaccount.com`. The
    * PROJECT_NUMBER identifies the project that contains the source Google
    * Cloud Storage bucket. To get the project number, go to the GCP Console
    * Dashboard.  GcsSource requires the `roles/storage.objectViewer` Cloud IAM
    * role.
    */
  var gcsSource: js.UndefOr[Schema$GoogleCloudHealthcareV1alphaGcsSource] = js.native
}

object Schema$InputConfig {
  @scala.inline
  def apply(gcsSource: Schema$GoogleCloudHealthcareV1alphaGcsSource = null): Schema$InputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InputConfig]
  }
}

