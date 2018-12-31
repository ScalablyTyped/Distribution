package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsInitResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsInitResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rulesetInfo parameter must be included in the response. This parameter specifies the regulatory domain and parameters applicable to that domain.
    * The database must include the authority field, which defines the regulatory domain for the location specified in the INIT_REQ message.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

