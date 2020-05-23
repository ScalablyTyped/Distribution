package typings.devextreme.anon

import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyChangesMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[typings.devextreme.devextremeNumbers.`0` | `1` | `2`] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var texts: js.UndefOr[AllFields] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ApplyChangesMode {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    applyChangesMode: instantly | onDemand = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    layout: typings.devextreme.devextremeNumbers.`0` | `1` | `2` = null,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    texts: AllFields = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ApplyChangesMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (applyChangesMode != null) __obj.updateDynamic("applyChangesMode")(applyChangesMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyChangesMode]
  }
}

