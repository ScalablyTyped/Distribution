package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateIdsResponse extends js.Object {
  /**
    * The keys specified in the request (in the same order), each with
    * its key path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}

object AllocateIdsResponse {
  @scala.inline
  def apply(keys: js.Array[Key] = null): AllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[AllocateIdsResponse]
  }
}

