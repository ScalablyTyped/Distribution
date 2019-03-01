package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleDatastoreAdminV1beta1ExportEntitiesResponse extends js.Object {
  /**
    * Location of the output metadata file. This can be used to begin an import
    * into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url.
    * Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleDatastoreAdminV1beta1ExportEntitiesResponse {
  @scala.inline
  def apply(outputUrl: java.lang.String = null): GoogleDatastoreAdminV1beta1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (outputUrl != null) __obj.updateDynamic("outputUrl")(outputUrl)
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ExportEntitiesResponse]
  }
}

