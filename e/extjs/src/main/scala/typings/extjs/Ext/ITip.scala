package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITip
  extends typings.extjs.Ext.panel.IPanel {
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[Boolean] = js.undefined
}

object ITip {
  @scala.inline
  def apply(
    IPanel: typings.extjs.Ext.panel.IPanel = null,
    constrainPosition: js.UndefOr[Boolean] = js.undefined
  ): ITip = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (!js.isUndefined(constrainPosition)) __obj.updateDynamic("constrainPosition")(constrainPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITip]
  }
}

