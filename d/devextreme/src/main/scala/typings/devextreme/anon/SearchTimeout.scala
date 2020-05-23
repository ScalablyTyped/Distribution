package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTimeout extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var showRelevantValues: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[Cancel] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SearchTimeout {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    showRelevantValues: js.UndefOr[Boolean] = js.undefined,
    texts: Cancel = null,
    width: js.UndefOr[Double] = js.undefined
  ): SearchTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRelevantValues)) __obj.updateDynamic("showRelevantValues")(showRelevantValues.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTimeout]
  }
}

