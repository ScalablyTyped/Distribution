package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizePolicy extends js.Object {
  /** [Property] (Boolean) */
  var readsHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var readsWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var setsHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var setsWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object ISizePolicy {
  @scala.inline
  def apply(
    readsHeight: js.UndefOr[scala.Boolean] = js.undefined,
    readsWidth: js.UndefOr[scala.Boolean] = js.undefined,
    setsHeight: js.UndefOr[scala.Boolean] = js.undefined,
    setsWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): ISizePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readsHeight)) __obj.updateDynamic("readsHeight")(readsHeight)
    if (!js.isUndefined(readsWidth)) __obj.updateDynamic("readsWidth")(readsWidth)
    if (!js.isUndefined(setsHeight)) __obj.updateDynamic("setsHeight")(setsHeight)
    if (!js.isUndefined(setsWidth)) __obj.updateDynamic("setsWidth")(setsWidth)
    __obj.asInstanceOf[ISizePolicy]
  }
}

