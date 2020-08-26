package typings.gestalt.mod

import typings.gestalt.anon.EventSyntheticEvent
import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.copy
import typings.gestalt.gestaltStrings.grab
import typings.gestalt.gestaltStrings.grabbing
import typings.gestalt.gestaltStrings.move
import typings.gestalt.gestaltStrings.noDrop
import typings.gestalt.gestaltStrings.pill
import typings.gestalt.gestaltStrings.pointer
import typings.gestalt.gestaltStrings.zoomIn
import typings.gestalt.gestaltStrings.zoomOut
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchableProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var fullHeight: js.UndefOr[Boolean] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  def onTouch(args: typings.gestalt.anon.`3`): Unit = js.native
}

object TouchableProps {
  @scala.inline
  def apply(onTouch: typings.gestalt.anon.`3` => Unit): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    __obj.asInstanceOf[TouchableProps]
  }
  @scala.inline
  implicit class TouchablePropsOps[Self <: TouchableProps] (val x: Self) extends AnyVal {
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
    def setOnTouch(value: typings.gestalt.anon.`3` => Unit): Self = this.set("onTouch", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFullHeight(value: Boolean): Self = this.set("fullHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullHeight: Self = this.set("fullHeight", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = this.set("mouseCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseCursor: Self = this.set("mouseCursor", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* args */ EventSyntheticEvent => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* args */ EventSyntheticEvent => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("rounding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
  }
  
}

