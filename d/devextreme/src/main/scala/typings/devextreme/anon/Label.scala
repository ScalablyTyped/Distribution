package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: js.UndefOr[CustomizeTextFormat] = js.undefined
  var separatorHeight: js.UndefOr[Double] = js.undefined
  var textLeftIndent: js.UndefOr[Double] = js.undefined
  var textTopIndent: js.UndefOr[Double] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    label: CustomizeTextFormat = null,
    separatorHeight: js.UndefOr[Double] = js.undefined,
    textLeftIndent: js.UndefOr[Double] = js.undefined,
    textTopIndent: js.UndefOr[Double] = js.undefined,
    topIndent: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(separatorHeight)) __obj.updateDynamic("separatorHeight")(separatorHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textLeftIndent)) __obj.updateDynamic("textLeftIndent")(textLeftIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textTopIndent)) __obj.updateDynamic("textTopIndent")(textTopIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topIndent)) __obj.updateDynamic("topIndent")(topIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

