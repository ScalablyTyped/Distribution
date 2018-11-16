package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomFloodlightVariable extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customFloodlightVariable". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The type of custom floodlight variable to supply a value for. These map to the "u[1-20]=" in the tags. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the custom floodlight variable. The length of string must not exceed 50 characters. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

