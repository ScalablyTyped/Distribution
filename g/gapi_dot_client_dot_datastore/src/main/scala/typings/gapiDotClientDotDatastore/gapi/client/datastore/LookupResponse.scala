package typings.gapiDotClientDotDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupResponse extends js.Object {
  /**
    * A list of keys that were not looked up due to resource constraints. The
    * order of results in this field is undefined and has no relation to the
    * order of the keys in the input.
    */
  var deferred: js.UndefOr[js.Array[Key]] = js.undefined
  /**
    * Entities found as `ResultType.FULL` entities. The order of results in this
    * field is undefined and has no relation to the order of the keys in the
    * input.
    */
  var found: js.UndefOr[js.Array[EntityResult]] = js.undefined
  /**
    * Entities not found as `ResultType.KEY_ONLY` entities. The order of results
    * in this field is undefined and has no relation to the order of the keys
    * in the input.
    */
  var missing: js.UndefOr[js.Array[EntityResult]] = js.undefined
}

object LookupResponse {
  @scala.inline
  def apply(
    deferred: js.Array[Key] = null,
    found: js.Array[EntityResult] = null,
    missing: js.Array[EntityResult] = null
  ): LookupResponse = {
    val __obj = js.Dynamic.literal()
    if (deferred != null) __obj.updateDynamic("deferred")(deferred)
    if (found != null) __obj.updateDynamic("found")(found)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    __obj.asInstanceOf[LookupResponse]
  }
}

