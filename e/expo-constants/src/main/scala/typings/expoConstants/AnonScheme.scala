package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScheme
  extends /* key */ StringDictionary[js.Any] {
  var scheme: js.UndefOr[String] = js.undefined
}

object AnonScheme {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, scheme: String = null): AnonScheme = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScheme]
  }
}

