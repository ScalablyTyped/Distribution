package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryOperation extends js.Object {
  /** Optional. Set this to True if this is the first log entry in the operation. */
  var first: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed to be part of the same operation. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Set this to True if this is the last log entry in the operation. */
  var last: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. An arbitrary producer identifier. The combination of id and producer must be globally unique. Examples for producer:
    * "MyDivision.MyBigCompany.com", "github.com/MyProject/MyApplication".
    */
  var producer: js.UndefOr[java.lang.String] = js.undefined
}

object LogEntryOperation {
  @scala.inline
  def apply(
    first: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    producer: java.lang.String = null
  ): LogEntryOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (producer != null) __obj.updateDynamic("producer")(producer)
    __obj.asInstanceOf[LogEntryOperation]
  }
}

