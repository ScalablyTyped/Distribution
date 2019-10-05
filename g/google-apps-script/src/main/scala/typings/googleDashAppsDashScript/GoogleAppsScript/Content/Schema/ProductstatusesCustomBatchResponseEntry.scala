package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var productStatus: js.UndefOr[ProductStatus] = js.undefined
}

object ProductstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Errors = null,
    kind: String = null,
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

