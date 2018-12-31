package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarrierData extends js.Object {
  /** The IATA designator of a carrier (airline, etc). For example, for American Airlines, the code is AA. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a kind of carrier (ie. an airline, bus line, railroad, etc). Value: the fixed string qpxexpress#carrierData. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The long, full name of a carrier. For example: American Airlines. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

