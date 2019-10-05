package typings.firefoxDashWebextDashBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry scalar. */
trait ScalarData extends js.Object {
  /**
    * True if this scalar entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[Boolean] = js.undefined
  /** True if this is a keyed scalar. */
  var keyed: js.UndefOr[Boolean] = js.undefined
  var kind: ScalarType
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[Boolean] = js.undefined
}

object ScalarData {
  @scala.inline
  def apply(
    kind: ScalarType,
    expired: js.UndefOr[Boolean] = js.undefined,
    keyed: js.UndefOr[Boolean] = js.undefined,
    record_on_release: js.UndefOr[Boolean] = js.undefined
  ): ScalarData = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (!js.isUndefined(expired)) __obj.updateDynamic("expired")(expired)
    if (!js.isUndefined(keyed)) __obj.updateDynamic("keyed")(keyed)
    if (!js.isUndefined(record_on_release)) __obj.updateDynamic("record_on_release")(record_on_release)
    __obj.asInstanceOf[ScalarData]
  }
}

