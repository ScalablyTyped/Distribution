package typings.gapiDotClientDotDatastore.gapi.client.datastore

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
  var inputUrl: js.UndefOr[String] = js.undefined
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
}

object GoogleDatastoreAdminV1beta1ImportEntitiesMetadata {
  @scala.inline
  def apply(
    common: GoogleDatastoreAdminV1beta1CommonMetadata = null,
    entityFilter: GoogleDatastoreAdminV1beta1EntityFilter = null,
    inputUrl: String = null,
    progressBytes: GoogleDatastoreAdminV1beta1Progress = null,
    progressEntities: GoogleDatastoreAdminV1beta1Progress = null
  ): GoogleDatastoreAdminV1beta1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (entityFilter != null) __obj.updateDynamic("entityFilter")(entityFilter.asInstanceOf[js.Any])
    if (inputUrl != null) __obj.updateDynamic("inputUrl")(inputUrl.asInstanceOf[js.Any])
    if (progressBytes != null) __obj.updateDynamic("progressBytes")(progressBytes.asInstanceOf[js.Any])
    if (progressEntities != null) __obj.updateDynamic("progressEntities")(progressEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ImportEntitiesMetadata]
  }
}

