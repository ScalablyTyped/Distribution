package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eventcategory
  extends /* key */ StringDictionary[js.Any] {
  var event_category: js.UndefOr[String] = js.native
  var event_label: js.UndefOr[String] = js.native
  var name: String = js.native
  var value: Double = js.native
}

object Eventcategory {
  @scala.inline
  def apply(name: String, value: Double): Eventcategory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcategory]
  }
  @scala.inline
  implicit class EventcategoryOps[Self <: Eventcategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent_category(value: String): Self = this.set("event_category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_category: Self = this.set("event_category", js.undefined)
    @scala.inline
    def setEvent_label(value: String): Self = this.set("event_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_label: Self = this.set("event_label", js.undefined)
  }
  
}

