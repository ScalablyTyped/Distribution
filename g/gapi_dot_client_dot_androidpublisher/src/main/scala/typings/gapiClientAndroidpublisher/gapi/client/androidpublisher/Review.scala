package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /** The name of the user who wrote the review. */
  var authorName: js.UndefOr[String] = js.undefined
  /** A repeated field containing comments for the review. */
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Unique identifier for this review. */
  var reviewId: js.UndefOr[String] = js.undefined
}

object Review {
  @scala.inline
  def apply(authorName: String = null, comments: js.Array[Comment] = null, reviewId: String = null): Review = {
    val __obj = js.Dynamic.literal()
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (reviewId != null) __obj.updateDynamic("reviewId")(reviewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
}

