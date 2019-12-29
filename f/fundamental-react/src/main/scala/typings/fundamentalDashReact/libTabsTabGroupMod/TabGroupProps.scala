package typings.fundamentalDashReact.libTabsTabGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Callback function when the user clicks on a tab. Parameters passed to the function are `event` and `index`. */
  var onTabClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double, Unit]
  ] = js.undefined
  /* The index of the selected tab. */
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double) => Unit = null,
    selectedIndex: Int | Double = null
  ): TabGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupProps]
  }
}

