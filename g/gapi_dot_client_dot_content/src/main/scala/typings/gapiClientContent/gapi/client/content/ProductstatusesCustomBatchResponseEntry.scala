package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** A list of errors, if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productstatusesCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.undefined
  /** The requested product status. Only defined if the request was successful. */
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
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productStatus != null) __obj.updateDynamic("productStatus")(productStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductstatusesCustomBatchResponseEntry]
  }
}

