package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Searchterm
  extends /* key */ StringDictionary[js.Any] {
  var search_term: js.UndefOr[String] = js.undefined
}

object Searchterm {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, search_term: String = null): Searchterm = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (search_term != null) __obj.updateDynamic("search_term")(search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Searchterm]
  }
}

