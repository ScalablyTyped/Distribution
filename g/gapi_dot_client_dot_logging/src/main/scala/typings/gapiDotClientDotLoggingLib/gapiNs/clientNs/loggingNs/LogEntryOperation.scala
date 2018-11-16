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

