package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch productstatuses response.
  */
@js.native
trait Schema$ProductstatusesCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors, if the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productstatusesCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested product status. Only defined if the request was successful.
    */
  var productStatus: js.UndefOr[Schema$ProductStatus] = js.native
}

object Schema$ProductstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    kind: String = null,
    productStatus: Schema$ProductStatus = null
  ): Schema$ProductstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productStatus != null) __obj.updateDynamic("productStatus")(productStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductstatusesCustomBatchResponseEntry]
  }
}

