package typings.fundamentalDashReact.libListGroupListGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
}

object ListGroupProps {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.Any] = null, className: String = null): ListGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ListGroupProps]
  }
}

