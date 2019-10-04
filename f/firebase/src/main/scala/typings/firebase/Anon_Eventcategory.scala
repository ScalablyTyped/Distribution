package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Eventcategory
  extends /* key */ StringDictionary[js.Any] {
  var event_category: js.UndefOr[String] = js.undefined
  var event_label: js.UndefOr[String] = js.undefined
  var name: String
  var value: Double
}

object Anon_Eventcategory {
  @scala.inline
  def apply(
    name: String,
    value: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    event_category: String = null,
    event_label: String = null
  ): Anon_Eventcategory = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (event_category != null) __obj.updateDynamic("event_category")(event_category)
    if (event_label != null) __obj.updateDynamic("event_label")(event_label)
    __obj.asInstanceOf[Anon_Eventcategory]
  }
}

