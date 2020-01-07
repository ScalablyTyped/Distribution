package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Redacts identifying information from the specified dataset.
  */
@js.native
trait Schema$DeidentifyDatasetRequest extends js.Object {
  /**
    * Deidentify configuration
    */
  var config: js.UndefOr[Schema$DeidentifyConfig] = js.native
  /**
    * The name of the dataset resource to which the redacted data should be
    * written (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * The new dataset must not exist, or the request will fail.
    */
  var destinationDataset: js.UndefOr[String] = js.native
}

object Schema$DeidentifyDatasetRequest {
  @scala.inline
  def apply(config: Schema$DeidentifyConfig = null, destinationDataset: String = null): Schema$DeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destinationDataset != null) __obj.updateDynamic("destinationDataset")(destinationDataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeidentifyDatasetRequest]
  }
}

