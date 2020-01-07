package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.AllocateIds.
  */
@js.native
trait Schema$AllocateIdsRequest extends js.Object {
  /**
    * A list of keys with incomplete key paths for which to allocate IDs. No
    * key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[Schema$Key]] = js.native
}

object Schema$AllocateIdsRequest {
  @scala.inline
  def apply(keys: js.Array[Schema$Key] = null): Schema$AllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AllocateIdsRequest]
  }
}

