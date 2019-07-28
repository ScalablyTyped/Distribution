package typings.firefoxDashWebextDashBrowser.browserNs.telemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry event. */
trait EventData extends js.Object {
  /**
    * True if this event entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[Boolean] = js.undefined
  /** List of allowed extra keys for this event entry. */
  var extra_keys: js.Array[String]
  /** List of methods for this event entry. */
  var methods: js.Array[String]
  /** List of objects for this event entry. */
  var objects: js.Array[String]
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[Boolean] = js.undefined
}

object EventData {
  @scala.inline
  def apply(
    extra_keys: js.Array[String],
    methods: js.Array[String],
    objects: js.Array[String],
    expired: js.UndefOr[Boolean] = js.undefined,
    record_on_release: js.UndefOr[Boolean] = js.undefined
  ): EventData = {
    val __obj = js.Dynamic.literal(extra_keys = extra_keys, methods = methods, objects = objects)
    if (!js.isUndefined(expired)) __obj.updateDynamic("expired")(expired)
    if (!js.isUndefined(record_on_release)) __obj.updateDynamic("record_on_release")(record_on_release)
    __obj.asInstanceOf[EventData]
  }
}

