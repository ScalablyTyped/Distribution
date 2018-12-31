package typings
package firefoxDashWebextDashBrowserLib.browserNs.telemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry event. */
trait EventData extends js.Object {
  /**
    * True if this event entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[scala.Boolean] = js.undefined
  /** List of allowed extra keys for this event entry. */
  var extra_keys: js.Array[java.lang.String]
  /** List of methods for this event entry. */
  var methods: js.Array[java.lang.String]
  /** List of objects for this event entry. */
  var objects: js.Array[java.lang.String]
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[scala.Boolean] = js.undefined
}

