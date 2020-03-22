package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonDisplayNameString
import typings.googleapis.AnonExtraDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReview extends js.Object {
  /**
    * Author of this review.
    */
  var author: js.UndefOr[AnonDisplayNameString] = js.native
  /**
    * Review text.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Date of this review.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * URL for the full review text, for reviews gathered from the web.
    */
  var fullTextUrl: js.UndefOr[String] = js.native
  /**
    * Resource type for a review.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Star rating for this review. Possible values are ONE, TWO, THREE, FOUR,
    * FIVE or NOT_RATED.
    */
  var rating: js.UndefOr[String] = js.native
  /**
    * Information regarding the source of this review, when the review is not
    * from a Google Books user.
    */
  var source: js.UndefOr[AnonExtraDescription] = js.native
  /**
    * Title for this review.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Source type for this review. Possible values are EDITORIAL, WEB_USER or
    * GOOGLE_USER.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Volume that this review is for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaReview {
  @scala.inline
  def apply(
    author: AnonDisplayNameString = null,
    content: String = null,
    date: String = null,
    fullTextUrl: String = null,
    kind: String = null,
    rating: String = null,
    source: AnonExtraDescription = null,
    title: String = null,
    `type`: String = null,
    volumeId: String = null
  ): SchemaReview = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (fullTextUrl != null) __obj.updateDynamic("fullTextUrl")(fullTextUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReview]
  }
}

