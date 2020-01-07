package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to import resources. The FHIR resources to be imported must have
  * client supplied IDs. The server will retain the resource IDs. The import
  * operation is idempotent. Retry will overwrite existing data identified by
  * client supplied IDs. The import operation is not transactional. The server
  * will not roll back any committed changes upon partial failures.
  */
@js.native
trait Schema$ImportResourcesRequest extends js.Object {
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage bucket/folder path to write files that contain error
    * details.
    */
  var gcsErrorLocation: js.UndefOr[Schema$GcsDataLocation] = js.native
  /**
    * Cloud Storage source data locations. Each Cloud Storage object should be
    * a text file that contains newline delimited JSON structures conforming to
    * FHIR standard.
    */
  var gcsSourceLocation: js.UndefOr[Schema$GcsDataLocation] = js.native
}

object Schema$ImportResourcesRequest {
  @scala.inline
  def apply(
    contentStructure: String = null,
    gcsErrorLocation: Schema$GcsDataLocation = null,
    gcsSourceLocation: Schema$GcsDataLocation = null
  ): Schema$ImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (contentStructure != null) __obj.updateDynamic("contentStructure")(contentStructure.asInstanceOf[js.Any])
    if (gcsErrorLocation != null) __obj.updateDynamic("gcsErrorLocation")(gcsErrorLocation.asInstanceOf[js.Any])
    if (gcsSourceLocation != null) __obj.updateDynamic("gcsSourceLocation")(gcsSourceLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportResourcesRequest]
  }
}

