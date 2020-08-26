package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Description
import typings.gapiClientBooks.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review extends js.Object {
  /** Author of this review. */
  var author: js.UndefOr[DisplayName] = js.native
  /** Review text. */
  var content: js.UndefOr[String] = js.native
  /** Date of this review. */
  var date: js.UndefOr[String] = js.native
  /** URL for the full review text, for reviews gathered from the web. */
  var fullTextUrl: js.UndefOr[String] = js.native
  /** Resource type for a review. */
  var kind: js.UndefOr[String] = js.native
  /** Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED. */
  var rating: js.UndefOr[String] = js.native
  /** Information regarding the source of this review, when the review is not from a Google Books user. */
  var source: js.UndefOr[Description] = js.native
  /** Title for this review. */
  var title: js.UndefOr[String] = js.native
  /** Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER. */
  var `type`: js.UndefOr[String] = js.native
  /** Volume that this review is for. */
  var volumeId: js.UndefOr[String] = js.native
}

object Review {
  @scala.inline
  def apply(): Review = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Review]
  }
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: DisplayName): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFullTextUrl(value: String): Self = this.set("fullTextUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTextUrl: Self = this.set("fullTextUrl", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setSource(value: Description): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

