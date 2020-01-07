package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.AllocateIds.
  */
@js.native
trait Schema$AllocateIdsResponse extends js.Object {
  /**
    * The keys specified in the request (in the same order), each with its key
    * path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[Schema$Key]] = js.native
}

object Schema$AllocateIdsResponse {
  @scala.inline
  def apply(keys: js.Array[Schema$Key] = null): Schema$AllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AllocateIdsResponse]
  }
}

