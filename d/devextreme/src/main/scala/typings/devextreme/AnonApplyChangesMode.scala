package typings.devextreme

import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyChangesMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var texts: js.UndefOr[AnonAllFields] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonApplyChangesMode {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    applyChangesMode: instantly | onDemand = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    layout: `0` | `1` | `2` = null,
    searchTimeout: Int | Double = null,
    texts: AnonAllFields = null,
    title: String = null,
    width: Int | Double = null
  ): AnonApplyChangesMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (applyChangesMode != null) __obj.updateDynamic("applyChangesMode")(applyChangesMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyChangesMode]
  }
}

