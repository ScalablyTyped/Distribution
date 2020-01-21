package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.AnonDescription
import typings.gapiClientBooks.AnonDisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /** Author of this review. */
  var author: js.UndefOr[AnonDisplayName] = js.undefined
  /** Review text. */
  var content: js.UndefOr[String] = js.undefined
  /** Date of this review. */
  var date: js.UndefOr[String] = js.undefined
  /** URL for the full review text, for reviews gathered from the web. */
  var fullTextUrl: js.UndefOr[String] = js.undefined
  /** Resource type for a review. */
  var kind: js.UndefOr[String] = js.undefined
  /** Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED. */
  var rating: js.UndefOr[String] = js.undefined
  /** Information regarding the source of this review, when the review is not from a Google Books user. */
  var source: js.UndefOr[AnonDescription] = js.undefined
  /** Title for this review. */
  var title: js.UndefOr[String] = js.undefined
  /** Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Volume that this review is for. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object Review {
  @scala.inline
  def apply(
    author: AnonDisplayName = null,
    content: String = null,
    date: String = null,
    fullTextUrl: String = null,
    kind: String = null,
    rating: String = null,
    source: AnonDescription = null,
    title: String = null,
    `type`: String = null,
    volumeId: String = null
  ): Review = {
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
    __obj.asInstanceOf[Review]
  }
}

