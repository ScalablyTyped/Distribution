package typings.freeDashStyle.freeDashStyleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles
  extends /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]]

object Styles {
  @scala.inline
  def apply(
    StringDictionary: /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Styles]
  }
}

