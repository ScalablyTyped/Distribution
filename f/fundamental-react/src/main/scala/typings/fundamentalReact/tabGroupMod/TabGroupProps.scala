package typings.fundamentalReact.tabGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var onTabClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double, Unit]
  ] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tabGroupProps: js.UndefOr[js.Any] = js.undefined
}

object TabGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double) => Unit = null,
    selectedIndex: Int | Double = null,
    size: js.Any = null,
    tabGroupProps: js.Any = null
  ): TabGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabGroupProps != null) __obj.updateDynamic("tabGroupProps")(tabGroupProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupProps]
  }
}

