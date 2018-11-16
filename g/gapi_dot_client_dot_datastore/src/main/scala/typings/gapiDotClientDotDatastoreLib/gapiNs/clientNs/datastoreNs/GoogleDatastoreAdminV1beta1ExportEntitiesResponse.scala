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

