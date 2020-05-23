package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eventcategory
  extends /* key */ StringDictionary[js.Any] {
  var event_category: js.UndefOr[String] = js.undefined
  var event_label: js.UndefOr[String] = js.undefined
  var name: String
  var value: Double
}

object Eventcategory {
  @scala.inline
  def apply(
    name: String,
    value: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    event_category: String = null,
    event_label: String = null
  ): Eventcategory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (event_category != null) __obj.updateDynamic("event_category")(event_category.asInstanceOf[js.Any])
    if (event_label != null) __obj.updateDynamic("event_label")(event_label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcategory]
  }
}

