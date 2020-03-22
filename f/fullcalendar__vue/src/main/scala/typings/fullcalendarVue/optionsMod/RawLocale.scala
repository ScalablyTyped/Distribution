package typings.fullcalendarVue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawLocale
  extends /* otherProp */ StringDictionary[js.Any] {
  var code: String
}

object RawLocale {
  @scala.inline
  def apply(code: String, StringDictionary: /* otherProp */ StringDictionary[js.Any] = null): RawLocale = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RawLocale]
  }
}

