package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}

object ShippingsettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    kind: java.lang.String = null,
    shippingSettings: ShippingSettings = null
  ): ShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (shippingSettings != null) __obj.updateDynamic("shippingSettings")(shippingSettings)
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponseEntry]
  }
}

