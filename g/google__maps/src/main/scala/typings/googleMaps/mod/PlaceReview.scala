package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceReview extends js.Object {
  /**
    * contains a collection of `AspectRating` objects, each of which provides a rating of a single attribute of the establishment.
    * The first object in the collection is considered the primary aspect.
    */
  var aspects: js.Array[AspectRating] = js.native
  /** the name of the user who submitted the review. Anonymous reviews are attributed to "A Google user". */
  var author_name: String = js.native
  /** the URL to the user's Google Maps Local Guides profile, if available. */
  var author_url: js.UndefOr[String] = js.native
  /**
    * an IETF language code indicating the language used in the user's review.
    * This field contains the main language tag only, and not the secondary tag indicating country or region.
    * For example, all the English reviews are tagged as 'en', and not 'en-AU' or 'en-UK' and so on.
    */
  var language: String = js.native
  /** the user's overall rating for this place. This is a whole number, ranging from 1 to 5. */
  var rating: Double = js.native
  /**
    * the user's review. When reviewing a location with Google Places, text reviews are considered optional.
    * Therefore, this field may by empty. Note that this field may include simple HTML markup.
    * For example, the entity reference `&amp;` may represent an ampersand character.
    */
  var text: String = js.native
  /** the time that the review was submitted, measured in the number of seconds since since midnight, January 1, 1970 UTC. */
  var time: String = js.native
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[AspectRating],
    author_name: String,
    language: String,
    rating: Double,
    text: String,
    time: String
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
  @scala.inline
  implicit class PlaceReviewOps[Self <: PlaceReview] (val x: Self) extends AnyVal {
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
    def setAspectsVarargs(value: AspectRating*): Self = this.set("aspects", js.Array(value :_*))
    @scala.inline
    def setAspects(value: js.Array[AspectRating]): Self = this.set("aspects", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_name(value: String): Self = this.set("author_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_url(value: String): Self = this.set("author_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor_url: Self = this.set("author_url", js.undefined)
  }
  
}

