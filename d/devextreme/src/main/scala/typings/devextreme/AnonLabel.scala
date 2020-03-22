package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: js.UndefOr[AnonCustomizeTextFormat] = js.undefined
  var separatorHeight: js.UndefOr[Double] = js.undefined
  var textLeftIndent: js.UndefOr[Double] = js.undefined
  var textTopIndent: js.UndefOr[Double] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(
    label: AnonCustomizeTextFormat = null,
    separatorHeight: Int | Double = null,
    textLeftIndent: Int | Double = null,
    textTopIndent: Int | Double = null,
    topIndent: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (separatorHeight != null) __obj.updateDynamic("separatorHeight")(separatorHeight.asInstanceOf[js.Any])
    if (textLeftIndent != null) __obj.updateDynamic("textLeftIndent")(textLeftIndent.asInstanceOf[js.Any])
    if (textTopIndent != null) __obj.updateDynamic("textTopIndent")(textTopIndent.asInstanceOf[js.Any])
    if (topIndent != null) __obj.updateDynamic("topIndent")(topIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

