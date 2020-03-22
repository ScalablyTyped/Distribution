package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchterm
  extends /* key */ StringDictionary[js.Any] {
  var search_term: js.UndefOr[String] = js.undefined
}

object AnonSearchterm {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, search_term: String = null): AnonSearchterm = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (search_term != null) __obj.updateDynamic("search_term")(search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchterm]
  }
}

