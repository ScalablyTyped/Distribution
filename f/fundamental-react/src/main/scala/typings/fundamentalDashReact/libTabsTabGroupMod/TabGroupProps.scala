package typings.fundamentalDashReact.libTabsTabGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Callback function when the user clicks on a tab. Parameters passed to the function are `event` and `index`. */
  var onTabClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /* The index of the selected tab. */
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    onTabClick: (/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ js.UndefOr[Double]) => Unit = null,
    selectedIndex: Int | Double = null
  ): TabGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupProps]
  }
}

