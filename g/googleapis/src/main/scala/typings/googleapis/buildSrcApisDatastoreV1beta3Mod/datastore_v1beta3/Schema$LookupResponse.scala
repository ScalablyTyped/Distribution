package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Lookup.
  */
@js.native
trait Schema$LookupResponse extends js.Object {
  /**
    * A list of keys that were not looked up due to resource constraints. The
    * order of results in this field is undefined and has no relation to the
    * order of the keys in the input.
    */
  var deferred: js.UndefOr[js.Array[Schema$Key]] = js.native
  /**
    * Entities found as `ResultType.FULL` entities. The order of results in
    * this field is undefined and has no relation to the order of the keys in
    * the input.
    */
  var found: js.UndefOr[js.Array[Schema$EntityResult]] = js.native
  /**
    * Entities not found as `ResultType.KEY_ONLY` entities. The order of
    * results in this field is undefined and has no relation to the order of
    * the keys in the input.
    */
  var missing: js.UndefOr[js.Array[Schema$EntityResult]] = js.native
}

object Schema$LookupResponse {
  @scala.inline
  def apply(
    deferred: js.Array[Schema$Key] = null,
    found: js.Array[Schema$EntityResult] = null,
    missing: js.Array[Schema$EntityResult] = null
  ): Schema$LookupResponse = {
    val __obj = js.Dynamic.literal()
    if (deferred != null) __obj.updateDynamic("deferred")(deferred.asInstanceOf[js.Any])
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LookupResponse]
  }
}

