package typings.frecency.anon

import typings.frecency.mod.idAttrFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExactQueryMatchWeight extends js.Object {
  var exactQueryMatchWeight: js.UndefOr[Double] = js.undefined
  var idAttribute: js.UndefOr[String | idAttrFn] = js.undefined
  var key: String
  var recentSelectionsLimit: js.UndefOr[Double] = js.undefined
  var recentSelectionsMatchWeight: js.UndefOr[Double] = js.undefined
  var storageProvider: js.UndefOr[js.Object] = js.undefined
  var subQueryMatchWeight: js.UndefOr[Double] = js.undefined
  var timeStampsLimit: js.UndefOr[Double] = js.undefined
}

object ExactQueryMatchWeight {
  @scala.inline
  def apply(
    key: String,
    exactQueryMatchWeight: js.UndefOr[Double] = js.undefined,
    idAttribute: String | idAttrFn = null,
    recentSelectionsLimit: js.UndefOr[Double] = js.undefined,
    recentSelectionsMatchWeight: js.UndefOr[Double] = js.undefined,
    storageProvider: js.Object = null,
    subQueryMatchWeight: js.UndefOr[Double] = js.undefined,
    timeStampsLimit: js.UndefOr[Double] = js.undefined
  ): ExactQueryMatchWeight = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(exactQueryMatchWeight)) __obj.updateDynamic("exactQueryMatchWeight")(exactQueryMatchWeight.get.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(recentSelectionsLimit)) __obj.updateDynamic("recentSelectionsLimit")(recentSelectionsLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recentSelectionsMatchWeight)) __obj.updateDynamic("recentSelectionsMatchWeight")(recentSelectionsMatchWeight.get.asInstanceOf[js.Any])
    if (storageProvider != null) __obj.updateDynamic("storageProvider")(storageProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(subQueryMatchWeight)) __obj.updateDynamic("subQueryMatchWeight")(subQueryMatchWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStampsLimit)) __obj.updateDynamic("timeStampsLimit")(timeStampsLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExactQueryMatchWeight]
  }
}

