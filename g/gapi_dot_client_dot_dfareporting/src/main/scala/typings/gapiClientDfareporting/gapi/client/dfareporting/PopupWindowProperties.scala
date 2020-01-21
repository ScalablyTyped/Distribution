package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowProperties extends js.Object {
  /** Popup dimension for a creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID */
  var dimension: js.UndefOr[Size] = js.undefined
  /** Upper-left corner coordinates of the popup window. Applicable if positionType is COORDINATES. */
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  /** Popup window position either centered or at specific coordinate. */
  var positionType: js.UndefOr[String] = js.undefined
  /** Whether to display the browser address bar. */
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
  /** Whether to display the browser menu bar. */
  var showMenuBar: js.UndefOr[Boolean] = js.undefined
  /** Whether to display the browser scroll bar. */
  var showScrollBar: js.UndefOr[Boolean] = js.undefined
  /** Whether to display the browser status bar. */
  var showStatusBar: js.UndefOr[Boolean] = js.undefined
  /** Whether to display the browser tool bar. */
  var showToolBar: js.UndefOr[Boolean] = js.undefined
  /** Title of popup window. */
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

