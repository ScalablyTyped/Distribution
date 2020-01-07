package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * The updated inventory information.
    */
  var inventory: js.UndefOr[Schema$PosInventory] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updated sale information.
    */
  var sale: js.UndefOr[Schema$PosSale] = js.native
  /**
    * The retrieved or updated store information.
    */
  var store: js.UndefOr[Schema$PosStore] = js.native
}

object Schema$PosCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    inventory: Schema$PosInventory = null,
    kind: String = null,
    sale: Schema$PosSale = null,
    store: Schema$PosStore = null
  ): Schema$PosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sale != null) __obj.updateDynamic("sale")(sale.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PosCustomBatchResponseEntry]
  }
}

