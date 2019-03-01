package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /** Author of this review. */
  var author: js.UndefOr[gapiDotClientDotBooksLib.Anon_DisplayName] = js.undefined
  /** Review text. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Date of this review. */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /** URL for the full review text, for reviews gathered from the web. */
  var fullTextUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for a review. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED. */
  var rating: js.UndefOr[java.lang.String] = js.undefined
  /** Information regarding the source of this review, when the review is not from a Google Books user. */
  var source: js.UndefOr[gapiDotClientDotBooksLib.Anon_Description] = js.undefined
  /** Title for this review. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Volume that this review is for. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object Review {
  @scala.inline
  def apply(
    author: gapiDotClientDotBooksLib.Anon_DisplayName = null,
    content: java.lang.String = null,
    date: java.lang.String = null,
    fullTextUrl: java.lang.String = null,
    kind: java.lang.String = null,
    rating: java.lang.String = null,
    source: gapiDotClientDotBooksLib.Anon_Description = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    volumeId: java.lang.String = null
  ): Review = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (content != null) __obj.updateDynamic("content")(content)
    if (date != null) __obj.updateDynamic("date")(date)
    if (fullTextUrl != null) __obj.updateDynamic("fullTextUrl")(fullTextUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rating != null) __obj.updateDynamic("rating")(rating)
    if (source != null) __obj.updateDynamic("source")(source)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[Review]
  }
}

