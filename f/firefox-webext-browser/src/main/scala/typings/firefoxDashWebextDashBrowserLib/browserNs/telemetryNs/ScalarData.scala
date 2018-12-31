package typings
package firefoxDashWebextDashBrowserLib.browserNs.telemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry scalar. */
trait ScalarData extends js.Object {
  /**
    * True if this scalar entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[scala.Boolean] = js.undefined
  /** True if this is a keyed scalar. */
  var keyed: js.UndefOr[scala.Boolean] = js.undefined
  var kind: ScalarType
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[scala.Boolean] = js.undefined
}

