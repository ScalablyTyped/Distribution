package typings
package fundamentalDashReactLib.libListGroupListGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemCheckboxProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var labelProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object ListGroupItemCheckboxProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    labelProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ListGroupItemCheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps)
    __obj.asInstanceOf[ListGroupItemCheckboxProps]
  }
}

