package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSuggestionsTagSuggestion extends js.Object {
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.native
  var tag: js.UndefOr[String] = js.native
}

object VideoSuggestionsTagSuggestion {
  @scala.inline
  def apply(): VideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSuggestionsTagSuggestion]
  }
  @scala.inline
  implicit class VideoSuggestionsTagSuggestionOps[Self <: VideoSuggestionsTagSuggestion] (val x: Self) extends AnyVal {
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
    def setCategoryRestrictsVarargs(value: String*): Self = this.set("categoryRestricts", js.Array(value :_*))
    @scala.inline
    def setCategoryRestricts(value: js.Array[String]): Self = this.set("categoryRestricts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryRestricts: Self = this.set("categoryRestricts", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

