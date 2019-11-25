package typings.gapiDotClientDotDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateIdsRequest extends js.Object {
  /**
    * A list of keys with incomplete key paths for which to allocate IDs.
    * No key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}

object AllocateIdsRequest {
  @scala.inline
  def apply(keys: js.Array[Key] = null): AllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateIdsRequest]
  }
}

