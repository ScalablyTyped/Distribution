package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ThreatInfo extends js.Object {
  /** The platform types to be checked. */
  var platformTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The threat entries to be checked. */
  var threatEntries: js.UndefOr[js.Array[ThreatEntry]] = js.undefined
  /** The entry types to be checked. */
  var threatEntryTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The threat types to be checked. */
  var threatTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

