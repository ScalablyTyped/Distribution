package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends js.Object {
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1beta1CommonMetadata] = js.undefined
  /** Description of which entities are being exported. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1beta1EntityFilter] = js.undefined
  /**
               * Location for the export metadata and data files. This will be the same
               * value as the
               * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix
               * field. The final output location is provided in
               * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
               */
  var outputUrlPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
}

