package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Change extends js.Object {
  /** Which ResourceRecordSets to add? */
  var additions: js.UndefOr[js.Array[ResourceRecordSet]] = js.undefined
  /** Which ResourceRecordSets to remove? Must match existing data exactly. */
  var deletions: js.UndefOr[js.Array[ResourceRecordSet]] = js.undefined
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dns#change". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time that this operation was started by the server (output only). This is in RFC3339 text format. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the operation (output only). */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

