package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Highlighted extends js.Object {
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

object Highlighted {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    highlighted: js.UndefOr[Boolean] = js.undefined,
    loadReplace: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    openerTabId: js.UndefOr[Double] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    successorTabId: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Highlighted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadReplace)) __obj.updateDynamic("loadReplace")(loadReplace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openerTabId)) __obj.updateDynamic("openerTabId")(openerTabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(successorTabId)) __obj.updateDynamic("successorTabId")(successorTabId.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlighted]
  }
}

