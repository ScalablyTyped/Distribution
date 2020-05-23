package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[Text]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Width {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    items: js.Array[Text] = null,
    width: js.UndefOr[Double] = js.undefined
  ): Width = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

