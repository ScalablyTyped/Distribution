package typings.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheme
  extends /* key */ StringDictionary[js.Any] {
  var scheme: js.UndefOr[String] = js.undefined
}

object Scheme {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, scheme: String = null): Scheme = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheme]
  }
}

