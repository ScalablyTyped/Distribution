package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarriersCarrier extends js.Object {
  /** The CLDR country code of the carrier (e.g., "US"). Always present. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the carrier (e.g., "UPS"). Always present. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A list of supported services (e.g., "ground") for that carrier. Contains at least one service. */
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

