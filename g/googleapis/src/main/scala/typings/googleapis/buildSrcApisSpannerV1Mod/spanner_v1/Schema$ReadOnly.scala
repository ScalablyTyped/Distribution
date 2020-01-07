package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message type to initiate a read-only transaction.
  */
@js.native
trait Schema$ReadOnly extends js.Object {
  /**
    * Executes all reads at a timestamp that is `exact_staleness` old. The
    * timestamp is chosen soon after the read is started.  Guarantees that all
    * writes that have committed more than the specified number of seconds ago
    * are visible. Because Cloud Spanner chooses the exact timestamp, this mode
    * works even if the client&#39;s local clock is substantially skewed from
    * Cloud Spanner commit timestamps.  Useful for reading at nearby replicas
    * without the distributed timestamp negotiation overhead of
    * `max_staleness`.
    */
  var exactStaleness: js.UndefOr[String] = js.native
  /**
    * Read data at a timestamp &gt;= `NOW - max_staleness` seconds. Guarantees
    * that all writes that have committed more than the specified number of
    * seconds ago are visible. Because Cloud Spanner chooses the exact
    * timestamp, this mode works even if the client&#39;s local clock is
    * substantially skewed from Cloud Spanner commit timestamps.  Useful for
    * reading the freshest data available at a nearby replica, while bounding
    * the possible staleness if the local replica has fallen behind.  Note that
    * this option can only be used in single-use transactions.
    */
  var maxStaleness: js.UndefOr[String] = js.native
  /**
    * Executes all reads at a timestamp &gt;= `min_read_timestamp`.  This is
    * useful for requesting fresher data than some previous read, or data that
    * is fresh enough to observe the effects of some previously committed
    * transaction whose timestamp is known.  Note that this option can only be
    * used in single-use transactions.  A timestamp in RFC3339 UTC
    * \&quot;Zulu\&quot; format, accurate to nanoseconds. Example:
    * `&quot;2014-10-02T15:01:23.045123456Z&quot;`.
    */
  var minReadTimestamp: js.UndefOr[String] = js.native
  /**
    * Executes all reads at the given timestamp. Unlike other modes, reads at a
    * specific timestamp are repeatable; the same read at the same timestamp
    * always returns the same data. If the timestamp is in the future, the read
    * will block until the specified timestamp, modulo the read&#39;s deadline.
    * Useful for large scale consistent reads such as mapreduces, or for
    * coordinating many reads against a consistent snapshot of the data.  A
    * timestamp in RFC3339 UTC \&quot;Zulu\&quot; format, accurate to
    * nanoseconds. Example: `&quot;2014-10-02T15:01:23.045123456Z&quot;`.
    */
  var readTimestamp: js.UndefOr[String] = js.native
  /**
    * If true, the Cloud Spanner-selected read timestamp is included in the
    * Transaction message that describes the transaction.
    */
  var returnReadTimestamp: js.UndefOr[Boolean] = js.native
  /**
    * Read at a timestamp where all previously committed transactions are
    * visible.
    */
  var strong: js.UndefOr[Boolean] = js.native
}

object Schema$ReadOnly {
  @scala.inline
  def apply(
    exactStaleness: String = null,
    maxStaleness: String = null,
    minReadTimestamp: String = null,
    readTimestamp: String = null,
    returnReadTimestamp: js.UndefOr[Boolean] = js.undefined,
    strong: js.UndefOr[Boolean] = js.undefined
  ): Schema$ReadOnly = {
    val __obj = js.Dynamic.literal()
    if (exactStaleness != null) __obj.updateDynamic("exactStaleness")(exactStaleness.asInstanceOf[js.Any])
    if (maxStaleness != null) __obj.updateDynamic("maxStaleness")(maxStaleness.asInstanceOf[js.Any])
    if (minReadTimestamp != null) __obj.updateDynamic("minReadTimestamp")(minReadTimestamp.asInstanceOf[js.Any])
    if (readTimestamp != null) __obj.updateDynamic("readTimestamp")(readTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(returnReadTimestamp)) __obj.updateDynamic("returnReadTimestamp")(returnReadTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReadOnly]
  }
}

