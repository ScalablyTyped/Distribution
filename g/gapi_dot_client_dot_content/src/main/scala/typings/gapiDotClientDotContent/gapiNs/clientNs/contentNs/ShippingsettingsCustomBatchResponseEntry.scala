package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.undefined
  /** The retrieved or updated account shipping settings. */
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}

object ShippingsettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Errors = null,
    kind: String = null,
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

