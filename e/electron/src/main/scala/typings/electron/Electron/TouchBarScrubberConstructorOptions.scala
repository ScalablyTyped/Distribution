package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to `true`.
    */
  var continuous: js.UndefOr[Boolean] = js.native
  /**
    * Called when the user taps any item.
    */
  var highlight: js.UndefOr[js.Function1[/* highlightedIndex */ Double, Unit]] = js.native
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem] = js.native
  /**
    * Can be `fixed` or `free`. The default is `free`.
    */
  var mode: js.UndefOr[fixed | free] = js.native
  /**
    * Selected overlay item style. Can be `background`, `outline` or `none`. Defaults
    * to `none`.
    */
  var overlayStyle: js.UndefOr[background | outline | none] = js.native
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  var select: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.native
  /**
    * Selected item style. Can be `background`, `outline` or `none`. Defaults to
    * `none`.
    */
  var selectedStyle: js.UndefOr[background | outline | none] = js.native
  /**
    * Defaults to `false`.
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.native
}

object TouchBarScrubberConstructorOptions {
  @scala.inline
  def apply(items: js.Array[ScrubberItem]): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarScrubberConstructorOptionsOps[Self <: TouchBarScrubberConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: ScrubberItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ScrubberItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setHighlight(value: /* highlightedIndex */ Double => Unit): Self = this.set("highlight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setMode(value: fixed | free): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOverlayStyle(value: background | outline | none): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setSelect(value: /* selectedIndex */ Double => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectedStyle(value: background | outline | none): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    @scala.inline
    def setShowArrowButtons(value: Boolean): Self = this.set("showArrowButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrowButtons: Self = this.set("showArrowButtons", js.undefined)
  }
  
}

