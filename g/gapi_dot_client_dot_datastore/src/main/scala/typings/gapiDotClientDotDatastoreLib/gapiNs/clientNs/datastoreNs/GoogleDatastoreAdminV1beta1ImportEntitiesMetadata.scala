package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleDatastoreAdminV1beta1ImportEntitiesMetadata extends js.Object {
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1beta1CommonMetadata] = js.undefined
  /** Description of which entities are being imported. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1beta1EntityFilter] = js.undefined
  /**
               * The location of the import metadata file. This will be the same value as
               * the google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url
               * field.
               */
  var inputUrl: js.UndefOr[java.lang.String] = js.undefined
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
}

