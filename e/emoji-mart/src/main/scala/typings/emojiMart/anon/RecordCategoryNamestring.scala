package typings.emojiMart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string> */
@js.native
trait RecordCategoryNamestring extends js.Object {
  var activity: String = js.native
  var custom: String = js.native
  var flags: String = js.native
  var foods: String = js.native
  var nature: String = js.native
  var objects: String = js.native
  var people: String = js.native
  var places: String = js.native
  var recent: String = js.native
  var search: String = js.native
  var symbols: String = js.native
}

object RecordCategoryNamestring {
  @scala.inline
  def apply(
    activity: String,
    custom: String,
    flags: String,
    foods: String,
    nature: String,
    objects: String,
    people: String,
    places: String,
    recent: String,
    search: String,
    symbols: String
  ): RecordCategoryNamestring = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], foods = foods.asInstanceOf[js.Any], nature = nature.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordCategoryNamestring]
  }
  @scala.inline
  implicit class RecordCategoryNamestringOps[Self <: RecordCategoryNamestring] (val x: Self) extends AnyVal {
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
    def setActivity(value: String): Self = this.set("activity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoods(value: String): Self = this.set("foods", value.asInstanceOf[js.Any])
    @scala.inline
    def setNature(value: String): Self = this.set("nature", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjects(value: String): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeople(value: String): Self = this.set("people", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaces(value: String): Self = this.set("places", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecent(value: String): Self = this.set("recent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbols(value: String): Self = this.set("symbols", value.asInstanceOf[js.Any])
  }
  
}

