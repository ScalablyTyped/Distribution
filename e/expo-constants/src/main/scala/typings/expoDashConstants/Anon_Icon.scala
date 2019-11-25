package typings.expoDashConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon
  extends /* key */ StringDictionary[js.Any] {
  var icon: js.UndefOr[String] = js.undefined
}

object Anon_Icon {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, icon: String = null): Anon_Icon = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Icon]
  }
}

