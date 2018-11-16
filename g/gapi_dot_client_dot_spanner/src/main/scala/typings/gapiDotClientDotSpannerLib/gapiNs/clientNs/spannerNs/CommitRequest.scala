package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommitRequest extends js.Object {
  /**
               * The mutations to be executed when this transaction commits. All
               * mutations are applied atomically, in the order they appear in
               * this list.
               */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.undefined
  /**
               * Execute mutations in a temporary transaction. Note that unlike
               * commit of a previously-started transaction, commit with a
               * temporary transaction is non-idempotent. That is, if the
               * `CommitRequest` is sent to Cloud Spanner more than once (for
               * instance, due to retries in the application, or in the
               * transport library), it is possible that the mutations are
               * executed more than once. If this is undesirable, use
               * BeginTransaction and
               * Commit instead.
               */
  var singleUseTransaction: js.UndefOr[TransactionOptions] = js.undefined
  /** Commit a previously-started transaction. */
  var transactionId: js.UndefOr[java.lang.String] = js.undefined
}

