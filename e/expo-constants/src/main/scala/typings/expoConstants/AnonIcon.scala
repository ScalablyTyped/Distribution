package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon
  extends /* key */ StringDictionary[js.Any] {
  var icon: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, icon: String = null): AnonIcon = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

