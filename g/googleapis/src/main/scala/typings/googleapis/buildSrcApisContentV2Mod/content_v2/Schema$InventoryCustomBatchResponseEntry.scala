package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch inventory response.
  */
@js.native
trait Schema$InventoryCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventoryCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$InventoryCustomBatchResponseEntry {
  @scala.inline
  def apply(batchId: Int | Double = null, errors: Schema$Errors = null, kind: String = null): Schema$InventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryCustomBatchResponseEntry]
  }
}

