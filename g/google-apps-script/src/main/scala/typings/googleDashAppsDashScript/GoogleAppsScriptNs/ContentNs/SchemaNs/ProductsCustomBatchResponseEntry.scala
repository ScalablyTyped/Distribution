package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[Product] = js.undefined
}

object ProductsCustomBatchResponseEntry {
  @scala.inline
  def apply(batchId: Int | Double = null, errors: Errors = null, kind: String = null, product: Product = null): ProductsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (product != null) __obj.updateDynamic("product")(product)
    __obj.asInstanceOf[ProductsCustomBatchResponseEntry]
  }
}

