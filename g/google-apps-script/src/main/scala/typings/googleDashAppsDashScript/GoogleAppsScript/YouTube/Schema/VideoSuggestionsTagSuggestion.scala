package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSuggestionsTagSuggestion extends js.Object {
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object VideoSuggestionsTagSuggestion {
  @scala.inline
  def apply(categoryRestricts: js.Array[String] = null, tag: String = null): VideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    if (categoryRestricts != null) __obj.updateDynamic("categoryRestricts")(categoryRestricts)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[VideoSuggestionsTagSuggestion]
  }
}

