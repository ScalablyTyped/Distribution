package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var inventory: js.UndefOr[PosInventory] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var sale: js.UndefOr[PosSale] = js.undefined
  var store: js.UndefOr[PosStore] = js.undefined
}

object PosCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    inventory: PosInventory = null,
    kind: java.lang.String = null,
    sale: PosSale = null,
    store: PosStore = null
  ): PosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (inventory != null) __obj.updateDynamic("inventory")(inventory)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (sale != null) __obj.updateDynamic("sale")(sale)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[PosCustomBatchResponseEntry]
  }
}

