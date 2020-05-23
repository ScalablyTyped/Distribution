package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeText[T] extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterValue[T], String]] = js.undefined
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[ClearFilter] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CustomizeText {
  @scala.inline
  def apply[T](
    customizeText: /* e */ FilterValue[T] => String = null,
    filterEnabled: js.UndefOr[Boolean] = js.undefined,
    texts: ClearFilter = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (!js.isUndefined(filterEnabled)) __obj.updateDynamic("filterEnabled")(filterEnabled.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizeText[T]]
  }
}

