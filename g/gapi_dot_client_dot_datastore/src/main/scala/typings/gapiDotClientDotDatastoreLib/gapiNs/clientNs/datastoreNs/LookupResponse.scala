package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

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

