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

