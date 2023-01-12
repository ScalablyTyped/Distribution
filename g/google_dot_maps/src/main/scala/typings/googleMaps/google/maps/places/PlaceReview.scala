package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single review of a place.
  */
trait PlaceReview extends StObject {
  
  /**
    * The aspects rated by the review. The ratings on a scale of 0 to 3.
    * @deprecated This field is no longer available.
    */
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.undefined
  
  /**
    * The name of the reviewer.
    */
  var author_name: String
  
  /**
    * A URL to the reviewer&#39;s profile. This will be <code>undefined</code>
    * when the reviewer&#39;s profile is unavailable.
    */
  var author_url: js.UndefOr[String] = js.undefined
  
  /**
    * An IETF language code indicating the language in which this review is
    * written. Note that this code includes only the main language tag without
    * any secondary tag indicating country or region. For example, all the
    * English reviews are tagged as <code>'en'</code> rather than
    * &#39;en-AU&#39; or
    * &#39;en-UK&#39;.
    */
  var language: String
  
  /**
    * A URL to the reviwer&#39;s profile image.
    */
  var profile_photo_url: String
  
  /**
    * The rating of this review, a number between 1.0 and 5.0 (inclusive).
    */
  var rating: js.UndefOr[Double] = js.undefined
  
  /**
    * A string of formatted recent time, expressing the review time relative to
    * the current time in a form appropriate for the language and country. For
    * example <code>&quot;a month ago&quot;</code>.
    */
  var relative_time_description: String
  
  /**
    * The text of a review.
    */
  var text: String
  
  /**
    * Timestamp for the review, expressed in seconds since epoch.
    */
  var time: Double
}
object PlaceReview {
  
  inline def apply(
    author_name: String,
    language: String,
    profile_photo_url: String,
    relative_time_description: String,
    text: String,
    time: Double
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(author_name = author_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], profile_photo_url = profile_photo_url.asInstanceOf[js.Any], relative_time_description = relative_time_description.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceReview] (val x: Self) extends AnyVal {
    
    inline def setAspects(value: js.Array[PlaceAspectRating]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    inline def setAspectsUndefined: Self = StObject.set(x, "aspects", js.undefined)
    
    inline def setAspectsVarargs(value: PlaceAspectRating*): Self = StObject.set(x, "aspects", js.Array(value*))
    
    inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    inline def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor_urlUndefined: Self = StObject.set(x, "author_url", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setProfile_photo_url(value: String): Self = StObject.set(x, "profile_photo_url", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRelative_time_description(value: String): Self = StObject.set(x, "relative_time_description", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
