package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.up
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlyoutProps extends js.Object {
  var anchor: js.Any = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.native
  var idealDirection: js.UndefOr[up | right | down | left] = js.native
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.native
  var shouldFocus: js.UndefOr[Boolean] = js.native
  var showCaret: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[xs | sm | md | lg | xl | Double] = js.native
   // ideally a HTMLAnchorElement
  def onDismiss(): Unit = js.native
}

object FlyoutProps {
  @scala.inline
  def apply(anchor: js.Any, onDismiss: () => Unit): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[FlyoutProps]
  }
  @scala.inline
  implicit class FlyoutPropsOps[Self <: FlyoutProps] (val x: Self) extends AnyVal {
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
    def setAnchor(value: js.Any): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColor(value: blue | orange | red | white | darkGray): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIdealDirection(value: up | right | down | left): Self = this.set("idealDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdealDirection: Self = this.set("idealDirection", js.undefined)
    @scala.inline
    def setPositionRelativeToAnchor(value: Boolean): Self = this.set("positionRelativeToAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionRelativeToAnchor: Self = this.set("positionRelativeToAnchor", js.undefined)
    @scala.inline
    def setShouldFocus(value: Boolean): Self = this.set("shouldFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFocus: Self = this.set("shouldFocus", js.undefined)
    @scala.inline
    def setShowCaret(value: Boolean): Self = this.set("showCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCaret: Self = this.set("showCaret", js.undefined)
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

