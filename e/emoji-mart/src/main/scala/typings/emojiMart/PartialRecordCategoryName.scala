package typings.emojiMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string>> */
trait PartialRecordCategoryName extends js.Object {
  var activity: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var foods: js.UndefOr[String] = js.undefined
  var nature: js.UndefOr[String] = js.undefined
  var objects: js.UndefOr[String] = js.undefined
  var people: js.UndefOr[String] = js.undefined
  var places: js.UndefOr[String] = js.undefined
  var recent: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var symbols: js.UndefOr[String] = js.undefined
}

object PartialRecordCategoryName {
  @scala.inline
  def apply(
    activity: String = null,
    custom: String = null,
    flags: String = null,
    foods: String = null,
    nature: String = null,
    objects: String = null,
    people: String = null,
    places: String = null,
    recent: String = null,
    search: String = null,
    symbols: String = null
  ): PartialRecordCategoryName = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (foods != null) __obj.updateDynamic("foods")(foods.asInstanceOf[js.Any])
    if (nature != null) __obj.updateDynamic("nature")(nature.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (people != null) __obj.updateDynamic("people")(people.asInstanceOf[js.Any])
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordCategoryName]
  }
}

