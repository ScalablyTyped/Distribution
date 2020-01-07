package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single tag suggestion with it&#39;s relevance information.
  */
@js.native
trait Schema$VideoSuggestionsTagSuggestion extends js.Object {
  /**
    * A set of video categories for which the tag is relevant. You can use this
    * information to display appropriate tag suggestions based on the video
    * category that the video uploader associates with the video. By default,
    * tag suggestions are relevant for all categories if there are no restricts
    * defined for the keyword.
    */
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The keyword tag suggested for the video.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$VideoSuggestionsTagSuggestion {
  @scala.inline
  def apply(categoryRestricts: js.Array[String] = null, tag: String = null): Schema$VideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    if (categoryRestricts != null) __obj.updateDynamic("categoryRestricts")(categoryRestricts.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoSuggestionsTagSuggestion]
  }
}

