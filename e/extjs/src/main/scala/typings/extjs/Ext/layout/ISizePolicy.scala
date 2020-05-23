package typings.extjs.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizePolicy extends js.Object {
  /** [Property] (Boolean) */
  var readsHeight: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var readsWidth: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var setsHeight: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var setsWidth: js.UndefOr[Boolean] = js.undefined
}

object ISizePolicy {
  @scala.inline
  def apply(
    readsHeight: js.UndefOr[Boolean] = js.undefined,
    readsWidth: js.UndefOr[Boolean] = js.undefined,
    setsHeight: js.UndefOr[Boolean] = js.undefined,
    setsWidth: js.UndefOr[Boolean] = js.undefined
  ): ISizePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readsHeight)) __obj.updateDynamic("readsHeight")(readsHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readsWidth)) __obj.updateDynamic("readsWidth")(readsWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setsHeight)) __obj.updateDynamic("setsHeight")(setsHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setsWidth)) __obj.updateDynamic("setsWidth")(setsWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizePolicy]
  }
}

