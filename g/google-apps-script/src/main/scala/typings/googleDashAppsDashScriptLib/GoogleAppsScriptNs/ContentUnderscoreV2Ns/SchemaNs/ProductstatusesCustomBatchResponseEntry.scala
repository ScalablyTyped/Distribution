package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var productStatus: js.UndefOr[ProductStatus] = js.undefined
}

object ProductstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    kind: java.lang.String = null,
    productStatus: ProductStatus = null
  ): ProductstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productStatus != null) __obj.updateDynamic("productStatus")(productStatus)
    __obj.asInstanceOf[ProductstatusesCustomBatchResponseEntry]
  }
}

