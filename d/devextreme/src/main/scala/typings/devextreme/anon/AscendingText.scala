package typings.devextreme.anon

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AscendingText extends js.Object {
  var ascendingText: js.UndefOr[String] = js.undefined
  var clearText: js.UndefOr[String] = js.undefined
  var descendingText: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[multiple | none | single_] = js.undefined
  var showSortIndexes: js.UndefOr[Boolean] = js.undefined
}

object AscendingText {
  @scala.inline
  def apply(
    ascendingText: String = null,
    clearText: String = null,
    descendingText: String = null,
    mode: multiple | none | single_ = null,
    showSortIndexes: js.UndefOr[Boolean] = js.undefined
  ): AscendingText = {
    val __obj = js.Dynamic.literal()
    if (ascendingText != null) __obj.updateDynamic("ascendingText")(ascendingText.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText.asInstanceOf[js.Any])
    if (descendingText != null) __obj.updateDynamic("descendingText")(descendingText.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showSortIndexes)) __obj.updateDynamic("showSortIndexes")(showSortIndexes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingText]
  }
}

