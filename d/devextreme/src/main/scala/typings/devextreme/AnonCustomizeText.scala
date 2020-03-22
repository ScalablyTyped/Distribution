package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomizeText[T] extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* e */ AnonFilterValue[T], String]] = js.undefined
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[AnonClearFilter] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonCustomizeText {
  @scala.inline
  def apply[T](
    customizeText: /* e */ AnonFilterValue[T] => String = null,
    filterEnabled: js.UndefOr[Boolean] = js.undefined,
    texts: AnonClearFilter = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonCustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (!js.isUndefined(filterEnabled)) __obj.updateDynamic("filterEnabled")(filterEnabled.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomizeText[T]]
  }
}

