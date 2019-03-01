package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasureMembers extends js.Object {
  var measure: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject] = js.undefined
  var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var negation: js.UndefOr[scala.Boolean] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MeasureMembers {
  @scala.inline
  def apply(
    measure: flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject = null,
    members: js.Array[java.lang.String] = null,
    negation: js.UndefOr[scala.Boolean] = js.undefined,
    quantity: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Anon_MeasureMembers = {
    val __obj = js.Dynamic.literal()
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (members != null) __obj.updateDynamic("members")(members)
    if (!js.isUndefined(negation)) __obj.updateDynamic("negation")(negation)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_MeasureMembers]
  }
}

