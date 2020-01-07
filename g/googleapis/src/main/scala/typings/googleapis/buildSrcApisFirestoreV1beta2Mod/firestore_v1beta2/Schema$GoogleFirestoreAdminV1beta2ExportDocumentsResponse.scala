package typings.googleapis.buildSrcApisFirestoreV1beta2Mod.firestore_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned in the google.longrunning.Operation response field.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta2ExportDocumentsResponse extends js.Object {
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta2ExportDocumentsResponse {
  @scala.inline
  def apply(outputUriPrefix: String = null): Schema$GoogleFirestoreAdminV1beta2ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (outputUriPrefix != null) __obj.updateDynamic("outputUriPrefix")(outputUriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta2ExportDocumentsResponse]
  }
}

