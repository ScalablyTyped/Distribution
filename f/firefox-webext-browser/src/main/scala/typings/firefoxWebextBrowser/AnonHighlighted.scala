package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlighted extends js.Object {
  /**
    * Whether the tab should be active. Does not affect whether the window is focused (see `windows.update`).
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Adds or removes the tab from the current selection. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  /** Whether the load should replace the current history entry for the tab. */
  var loadReplace: js.UndefOr[Boolean] = js.undefined
  /** Whether the tab should be muted. */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /** Whether the tab should be pinned. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the tab should be selected.
    * @deprecated Please use _highlighted_.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of this tab's successor. If specified, the successor tab must be in the same window as this tab.
    */
  var successorTabId: js.UndefOr[Double] = js.undefined
  /** A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonHighlighted {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    highlighted: js.UndefOr[Boolean] = js.undefined,
    loadReplace: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    openerTabId: Int | Double = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    successorTabId: Int | Double = null,
    url: String = null
  ): AnonHighlighted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted.asInstanceOf[js.Any])
    if (!js.isUndefined(loadReplace)) __obj.updateDynamic("loadReplace")(loadReplace.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (successorTabId != null) __obj.updateDynamic("successorTabId")(successorTabId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlighted]
  }
}

