package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceReview extends js.Object {
  /**
    * contains a collection of `AspectRating` objects, each of which provides a rating of a single attribute of the establishment.
    * The first object in the collection is considered the primary aspect.
    */
  var aspects: js.Array[AspectRating]
  /** the name of the user who submitted the review. Anonymous reviews are attributed to "A Google user". */
  var author_name: String
  /** the URL to the user's Google Maps Local Guides profile, if available. */
  var author_url: js.UndefOr[String] = js.undefined
  /**
    * an IETF language code indicating the language used in the user's review.
    * This field contains the main language tag only, and not the secondary tag indicating country or region.
    * For example, all the English reviews are tagged as 'en', and not 'en-AU' or 'en-UK' and so on.
    */
  var language: String
  /** the user's overall rating for this place. This is a whole number, ranging from 1 to 5. */
  var rating: Double
  /**
    * the user's review. When reviewing a location with Google Places, text reviews are considered optional.
    * Therefore, this field may by empty. Note that this field may include simple HTML markup.
    * For example, the entity reference `&amp;` may represent an ampersand character.
    */
  var text: String
  /** the time that the review was submitted, measured in the number of seconds since since midnight, January 1, 1970 UTC. */
  var time: String
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[AspectRating],
    author_name: String,
    language: String,
    rating: Double,
    text: String,
    time: String,
    author_url: String = null
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (author_url != null) __obj.updateDynamic("author_url")(author_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
}

