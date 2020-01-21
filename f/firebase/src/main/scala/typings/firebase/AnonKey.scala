package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  var method: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, method: String = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

