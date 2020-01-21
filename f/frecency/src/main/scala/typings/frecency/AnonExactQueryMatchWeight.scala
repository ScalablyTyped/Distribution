package typings.frecency

import typings.frecency.mod.idAttrFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExactQueryMatchWeight extends js.Object {
  var exactQueryMatchWeight: js.UndefOr[Double] = js.undefined
  var idAttribute: js.UndefOr[String | idAttrFn] = js.undefined
  var key: String
  var recentSelectionsLimit: js.UndefOr[Double] = js.undefined
  var recentSelectionsMatchWeight: js.UndefOr[Double] = js.undefined
  var storageProvider: js.UndefOr[js.Object] = js.undefined
  var subQueryMatchWeight: js.UndefOr[Double] = js.undefined
  var timeStampsLimit: js.UndefOr[Double] = js.undefined
}

object AnonExactQueryMatchWeight {
  @scala.inline
  def apply(
    key: String,
    exactQueryMatchWeight: Int | Double = null,
    idAttribute: String | idAttrFn = null,
    recentSelectionsLimit: Int | Double = null,
    recentSelectionsMatchWeight: Int | Double = null,
    storageProvider: js.Object = null,
    subQueryMatchWeight: Int | Double = null,
    timeStampsLimit: Int | Double = null
  ): AnonExactQueryMatchWeight = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (exactQueryMatchWeight != null) __obj.updateDynamic("exactQueryMatchWeight")(exactQueryMatchWeight.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (recentSelectionsLimit != null) __obj.updateDynamic("recentSelectionsLimit")(recentSelectionsLimit.asInstanceOf[js.Any])
    if (recentSelectionsMatchWeight != null) __obj.updateDynamic("recentSelectionsMatchWeight")(recentSelectionsMatchWeight.asInstanceOf[js.Any])
    if (storageProvider != null) __obj.updateDynamic("storageProvider")(storageProvider.asInstanceOf[js.Any])
    if (subQueryMatchWeight != null) __obj.updateDynamic("subQueryMatchWeight")(subQueryMatchWeight.asInstanceOf[js.Any])
    if (timeStampsLimit != null) __obj.updateDynamic("timeStampsLimit")(timeStampsLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExactQueryMatchWeight]
  }
}

