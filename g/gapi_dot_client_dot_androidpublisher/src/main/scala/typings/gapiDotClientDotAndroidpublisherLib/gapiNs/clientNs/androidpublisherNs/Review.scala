package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /** The name of the user who wrote the review. */
  var authorName: js.UndefOr[java.lang.String] = js.undefined
  /** A repeated field containing comments for the review. */
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Unique identifier for this review. */
  var reviewId: js.UndefOr[java.lang.String] = js.undefined
}

object Review {
  @scala.inline
  def apply(
    authorName: java.lang.String = null,
    comments: js.Array[Comment] = null,
    reviewId: java.lang.String = null
  ): Review = {
    val __obj = js.Dynamic.literal()
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (reviewId != null) __obj.updateDynamic("reviewId")(reviewId)
    __obj.asInstanceOf[Review]
  }
}

