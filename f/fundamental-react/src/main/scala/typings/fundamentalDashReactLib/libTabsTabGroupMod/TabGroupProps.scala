package typings
package fundamentalDashReactLib.libTabsTabGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Callback function when the user clicks on a tab. Parameters passed to the function are `event` and `index`. */
  var onTabClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /* The index of the selected tab. */
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
}

object TabGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    onTabClick: (/* event */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    selectedIndex: scala.Int | scala.Double = null
  ): TabGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupProps]
  }
}

