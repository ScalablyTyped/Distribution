package typings
package frecencyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExactQueryMatchWeight extends js.Object {
  var exactQueryMatchWeight: js.UndefOr[scala.Double] = js.undefined
  var idAttribute: js.UndefOr[java.lang.String | frecencyLib.frecencyMod.idAttrFn] = js.undefined
  var key: java.lang.String
  var recentSelectionsLimit: js.UndefOr[scala.Double] = js.undefined
  var recentSelectionsMatchWeight: js.UndefOr[scala.Double] = js.undefined
  var storageProvider: js.UndefOr[js.Object] = js.undefined
  var subQueryMatchWeight: js.UndefOr[scala.Double] = js.undefined
  var timeStampsLimit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ExactQueryMatchWeight {
  @scala.inline
  def apply(
    key: java.lang.String,
    exactQueryMatchWeight: scala.Int | scala.Double = null,
    idAttribute: java.lang.String | frecencyLib.frecencyMod.idAttrFn = null,
    recentSelectionsLimit: scala.Int | scala.Double = null,
    recentSelectionsMatchWeight: scala.Int | scala.Double = null,
    storageProvider: js.Object = null,
    subQueryMatchWeight: scala.Int | scala.Double = null,
    timeStampsLimit: scala.Int | scala.Double = null
  ): Anon_ExactQueryMatchWeight = {
    val __obj = js.Dynamic.literal(key = key)
    if (exactQueryMatchWeight != null) __obj.updateDynamic("exactQueryMatchWeight")(exactQueryMatchWeight.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (recentSelectionsLimit != null) __obj.updateDynamic("recentSelectionsLimit")(recentSelectionsLimit.asInstanceOf[js.Any])
    if (recentSelectionsMatchWeight != null) __obj.updateDynamic("recentSelectionsMatchWeight")(recentSelectionsMatchWeight.asInstanceOf[js.Any])
    if (storageProvider != null) __obj.updateDynamic("storageProvider")(storageProvider)
    if (subQueryMatchWeight != null) __obj.updateDynamic("subQueryMatchWeight")(subQueryMatchWeight.asInstanceOf[js.Any])
    if (timeStampsLimit != null) __obj.updateDynamic("timeStampsLimit")(timeStampsLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExactQueryMatchWeight]
  }
}

