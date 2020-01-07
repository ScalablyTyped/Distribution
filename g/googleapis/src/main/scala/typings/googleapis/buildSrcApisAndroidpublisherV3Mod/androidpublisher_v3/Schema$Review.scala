package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Review extends js.Object {
  /**
    * The name of the user who wrote the review.
    */
  var authorName: js.UndefOr[String] = js.native
  /**
    * A repeated field containing comments for the review.
    */
  var comments: js.UndefOr[js.Array[Schema$Comment]] = js.native
  /**
    * Unique identifier for this review.
    */
  var reviewId: js.UndefOr[String] = js.native
}

object Schema$Review {
  @scala.inline
  def apply(authorName: String = null, comments: js.Array[Schema$Comment] = null, reviewId: String = null): Schema$Review = {
    val __obj = js.Dynamic.literal()
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (reviewId != null) __obj.updateDynamic("reviewId")(reviewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Review]
  }
}

