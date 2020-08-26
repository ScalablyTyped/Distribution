package typings.fundamentalReact.tabGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabGroupProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var onTabClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double, Unit]
  ] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var size: js.UndefOr[js.Any] = js.native
  var tabGroupProps: js.UndefOr[js.Any] = js.native
}

object TabGroupProps {
  @scala.inline
  def apply(): TabGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabGroupProps]
  }
  @scala.inline
  implicit class TabGroupPropsOps[Self <: TabGroupProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setOnTabClick(value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double) => Unit): Self = this.set("onTabClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTabGroupProps(value: js.Any): Self = this.set("tabGroupProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabGroupProps: Self = this.set("tabGroupProps", js.undefined)
  }
  
}

