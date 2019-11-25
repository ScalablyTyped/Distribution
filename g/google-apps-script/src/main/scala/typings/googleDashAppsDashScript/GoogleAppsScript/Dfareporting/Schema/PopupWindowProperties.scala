package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowProperties extends js.Object {
  var dimension: js.UndefOr[Size] = js.undefined
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  var positionType: js.UndefOr[String] = js.undefined
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
  var showMenuBar: js.UndefOr[Boolean] = js.undefined
  var showScrollBar: js.UndefOr[Boolean] = js.undefined
  var showStatusBar: js.UndefOr[Boolean] = js.undefined
  var showToolBar: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PopupWindowProperties {
  @scala.inline
  def apply(
    dimension: Size = null,
    offset: OffsetPosition = null,
    positionType: String = null,
    showAddressBar: js.UndefOr[Boolean] = js.undefined,
    showMenuBar: js.UndefOr[Boolean] = js.undefined,
    showScrollBar: js.UndefOr[Boolean] = js.undefined,
    showStatusBar: js.UndefOr[Boolean] = js.undefined,
    showToolBar: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): PopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (positionType != null) __obj.updateDynamic("positionType")(positionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddressBar)) __obj.updateDynamic("showAddressBar")(showAddressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showMenuBar)) __obj.updateDynamic("showMenuBar")(showMenuBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollBar)) __obj.updateDynamic("showScrollBar")(showScrollBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showStatusBar)) __obj.updateDynamic("showStatusBar")(showStatusBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolBar)) __obj.updateDynamic("showToolBar")(showToolBar.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowProperties]
  }
}

