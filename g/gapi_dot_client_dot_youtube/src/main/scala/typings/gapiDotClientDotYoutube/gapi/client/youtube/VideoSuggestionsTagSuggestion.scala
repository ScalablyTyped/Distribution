package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSuggestionsTagSuggestion extends js.Object {
  /**
    * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video
    * category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts
    * defined for the keyword.
    */
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.undefined
  /** The keyword tag suggested for the video. */
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

