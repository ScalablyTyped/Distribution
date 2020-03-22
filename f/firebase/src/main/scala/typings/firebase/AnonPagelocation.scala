package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagelocation
  extends /* key */ StringDictionary[js.Any] {
  var page_location: js.UndefOr[String] = js.undefined
  var page_path: js.UndefOr[String] = js.undefined
  var page_title: js.UndefOr[String] = js.undefined
}

object AnonPagelocation {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    page_location: String = null,
    page_path: String = null,
    page_title: String = null
  ): AnonPagelocation = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (page_location != null) __obj.updateDynamic("page_location")(page_location.asInstanceOf[js.Any])
    if (page_path != null) __obj.updateDynamic("page_path")(page_path.asInstanceOf[js.Any])
    if (page_title != null) __obj.updateDynamic("page_title")(page_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPagelocation]
  }
}

