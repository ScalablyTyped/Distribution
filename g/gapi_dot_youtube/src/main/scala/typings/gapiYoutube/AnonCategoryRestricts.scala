package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategoryRestricts extends js.Object {
  /**
    * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
    */
  var categoryRestricts: js.Array[String]
  /**
    * The keyword tag suggested for the video.
    */
  var tag: String
}

object AnonCategoryRestricts {
  @scala.inline
  def apply(categoryRestricts: js.Array[String], tag: String): AnonCategoryRestricts = {
    val __obj = js.Dynamic.literal(categoryRestricts = categoryRestricts.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategoryRestricts]
  }
}

