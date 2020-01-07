package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for Index operations.
  */
@js.native
trait Schema$GoogleDatastoreAdminV1IndexOperationMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[Schema$GoogleDatastoreAdminV1CommonMetadata] = js.native
  /**
    * The index resource ID that this operation is acting on.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[Schema$GoogleDatastoreAdminV1Progress] = js.native
}

object Schema$GoogleDatastoreAdminV1IndexOperationMetadata {
  @scala.inline
  def apply(
    common: Schema$GoogleDatastoreAdminV1CommonMetadata = null,
    indexId: String = null,
    progressEntities: Schema$GoogleDatastoreAdminV1Progress = null
  ): Schema$GoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (indexId != null) __obj.updateDynamic("indexId")(indexId.asInstanceOf[js.Any])
    if (progressEntities != null) __obj.updateDynamic("progressEntities")(progressEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDatastoreAdminV1IndexOperationMetadata]
  }
}

