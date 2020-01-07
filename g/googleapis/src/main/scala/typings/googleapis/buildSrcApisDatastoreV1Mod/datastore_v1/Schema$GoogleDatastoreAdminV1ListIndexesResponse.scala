package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ListIndexes.
  */
@js.native
trait Schema$GoogleDatastoreAdminV1ListIndexesResponse extends js.Object {
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[Schema$GoogleDatastoreAdminV1Index]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleDatastoreAdminV1ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[Schema$GoogleDatastoreAdminV1Index] = null, nextPageToken: String = null): Schema$GoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDatastoreAdminV1ListIndexesResponse]
  }
}

