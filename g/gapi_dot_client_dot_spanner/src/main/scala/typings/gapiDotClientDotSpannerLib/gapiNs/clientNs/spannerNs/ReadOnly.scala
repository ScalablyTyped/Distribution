package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnly extends js.Object {
  /**
    * Executes all reads at a timestamp that is `exact_staleness`
    * old. The timestamp is chosen soon after the read is started.
    *
    * Guarantees that all writes that have committed more than the
    * specified number of seconds ago are visible. Because Cloud Spanner
    * chooses the exact timestamp, this mode works even if the client's
    * local clock is substantially skewed from Cloud Spanner commit
    * timestamps.
    *
    * Useful for reading at nearby replicas without the distributed
    * timestamp negotiation overhead of `max_staleness`.
    */
  var exactStaleness: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Read data at a timestamp >= `NOW - max_staleness`
    * seconds. Guarantees that all writes that have committed more
    * than the specified number of seconds ago are visible. Because
    * Cloud Spanner chooses the exact timestamp, this mode works even if
    * the client's local clock is substantially skewed from Cloud Spanner
    * commit timestamps.
    *
    * Useful for reading the freshest data available at a nearby
    * replica, while bounding the possible staleness if the local
    * replica has fallen behind.
    *
    * Note that this option can only be used in single-use
    * transactions.
    */
  var maxStaleness: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Executes all reads at a timestamp >= `min_read_timestamp`.
    *
    * This is useful for requesting fresher data than some previous
    * read, or data that is fresh enough to observe the effects of some
    * previously committed transaction whose timestamp is known.
    *
    * Note that this option can only be used in single-use transactions.
    */
  var minReadTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Executes all reads at the given timestamp. Unlike other modes,
    * reads at a specific timestamp are repeatable; the same read at
    * the same timestamp always returns the same data. If the
    * timestamp is in the future, the read will block until the
    * specified timestamp, modulo the read's deadline.
    *
    * Useful for large scale consistent reads such as mapreduces, or
    * for coordinating many reads against a consistent snapshot of the
    * data.
    */
  var readTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the Cloud Spanner-selected read timestamp is included in
    * the Transaction message that describes the transaction.
    */
  var returnReadTimestamp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Read at a timestamp where all previously committed transactions
    * are visible.
    */
  var strong: js.UndefOr[scala.Boolean] = js.undefined
}

