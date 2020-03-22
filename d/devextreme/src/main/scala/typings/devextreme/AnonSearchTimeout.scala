package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchTimeout extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var showRelevantValues: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[AnonCancel] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonSearchTimeout {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    searchTimeout: Int | Double = null,
    showRelevantValues: js.UndefOr[Boolean] = js.undefined,
    texts: AnonCancel = null,
    width: Int | Double = null
  ): AnonSearchTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(showRelevantValues)) __obj.updateDynamic("showRelevantValues")(showRelevantValues.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchTimeout]
  }
}

