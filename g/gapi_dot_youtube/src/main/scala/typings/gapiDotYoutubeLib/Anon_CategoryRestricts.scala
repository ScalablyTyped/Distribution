package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryRestricts extends js.Object {
  /**
    * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
    */
  var categoryRestricts: js.Array[java.lang.String]
  /**
    * The keyword tag suggested for the video.
    */
  var tag: java.lang.String
}

object Anon_CategoryRestricts {
  @scala.inline
  def apply(categoryRestricts: js.Array[java.lang.String], tag: java.lang.String): Anon_CategoryRestricts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categoryRestricts")(categoryRestricts)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_CategoryRestricts]
  }
}

