package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * Transaction will not write.
    *
    * Authorization to begin a read-only transaction requires
    * `spanner.databases.beginReadOnlyTransaction` permission
    * on the `session` resource.
    */
  var readOnly: js.UndefOr[ReadOnly] = js.undefined
  /**
    * Transaction may write.
    *
    * Authorization to begin a read-write transaction requires
    * `spanner.databases.beginOrRollbackReadWriteTransaction` permission
    * on the `session` resource.
    */
  var readWrite: js.UndefOr[js.Any] = js.undefined
}

