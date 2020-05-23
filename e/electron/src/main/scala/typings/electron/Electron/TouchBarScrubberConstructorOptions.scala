package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to `true`.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when the user taps any item.
    */
  var highlight: js.UndefOr[js.Function1[/* highlightedIndex */ Double, Unit]] = js.undefined
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem]
  /**
    * Can be `fixed` or `free`. The default is `free`.
    */
  var mode: js.UndefOr[fixed | free] = js.undefined
  /**
    * Selected overlay item style. Can be `background`, `outline` or `none`. Defaults
    * to `none`.
    */
  var overlayStyle: js.UndefOr[background | outline | none] = js.undefined
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  var select: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.undefined
  /**
    * Selected item style. Can be `background`, `outline` or `none`. Defaults to
    * `none`.
    */
  var selectedStyle: js.UndefOr[background | outline | none] = js.undefined
  /**
    * Defaults to `false`.
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.undefined
}

object TouchBarScrubberConstructorOptions {
  @scala.inline
  def apply(
    items: js.Array[ScrubberItem],
    continuous: js.UndefOr[Boolean] = js.undefined,
    highlight: /* highlightedIndex */ Double => Unit = null,
    mode: fixed | free = null,
    overlayStyle: background | outline | none = null,
    select: /* selectedIndex */ Double => Unit = null,
    selectedStyle: background | outline | none = null,
    showArrowButtons: js.UndefOr[Boolean] = js.undefined
  ): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.get.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction1(highlight))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowButtons)) __obj.updateDynamic("showArrowButtons")(showArrowButtons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
}

