package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSelectionContextMenu extends js.Object {
  /** Enables/disables the copy menu in the text selection context menu.
    */
  var isCopyEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/ disables the text selection context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the highlight annotation menu in the text selection context menu.
    */
  var isHighlightEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the search menu in the text selection context menu.
    */
  var isSearchEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the strikeout annotation menu in the text selection context menu.
    */
  var isStrikeoutEnable: js.UndefOr[Boolean] = js.undefined
}

object TextSelectionContextMenu {
  @scala.inline
  def apply(
    isCopyEnable: js.UndefOr[Boolean] = js.undefined,
    isEnable: js.UndefOr[Boolean] = js.undefined,
    isHighlightEnable: js.UndefOr[Boolean] = js.undefined,
    isSearchEnable: js.UndefOr[Boolean] = js.undefined,
    isStrikeoutEnable: js.UndefOr[Boolean] = js.undefined
  ): TextSelectionContextMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCopyEnable)) __obj.updateDynamic("isCopyEnable")(isCopyEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnable)) __obj.updateDynamic("isEnable")(isEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlightEnable)) __obj.updateDynamic("isHighlightEnable")(isHighlightEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchEnable)) __obj.updateDynamic("isSearchEnable")(isSearchEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStrikeoutEnable)) __obj.updateDynamic("isStrikeoutEnable")(isStrikeoutEnable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSelectionContextMenu]
  }
}

