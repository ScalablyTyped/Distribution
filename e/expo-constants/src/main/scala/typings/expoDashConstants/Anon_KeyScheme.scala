package typings.expoDashConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyScheme
  extends /* key */ StringDictionary[js.Any] {
  var scheme: js.UndefOr[String] = js.undefined
}

object Anon_KeyScheme {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, scheme: String = null): Anon_KeyScheme = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_KeyScheme]
  }
}

