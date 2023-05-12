package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Review extends StObject {
  
  /**
    * The name of the reviewer.
    */
  var author: String | Null
  
  /**
    * A URL to the reviwer&#39;s profile image.
    */
  var authorPhotoURI: String | Null
  
  /**
    * A URL to the reviewer&#39;s profile.
    */
  var authorURI: String | Null
  
  var publishTime: js.Date | Null
  
  /**
    * The rating of this review, a number between 1.0 and 5.0 (inclusive).
    */
  var rating: Double | Null
  
  /**
    * A string of formatted recent time, expressing the review time relative to
    * the current time in a form appropriate for the language and country. For
    * example
    * `&quot;a month ago&quot;&#39;.
    */
  var relativePublishTimeDescription: String | Null
  
  /**
    * The text of a review.
    */
  var text: String | Null
  
  /**
    * An IETF language code indicating the language in which this review is
    * written. Note that this code includes only the main language tag without
    * any secondary tag indicating country or region. For example, all the
    * English reviews are tagged as <code>'en'</code> rather than
    * &#39;en-AU&#39; or
    * &#39;en-UK&#39;.
    */
  var textLanguageCode: String | Null
}
object Review {
  
  inline def apply(): Review = {
    val __obj = js.Dynamic.literal(author = null, authorPhotoURI = null, authorURI = null, publishTime = null, rating = null, relativePublishTimeDescription = null, text = null, textLanguageCode = null)
    __obj.asInstanceOf[Review]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorPhotoURI(value: String): Self = StObject.set(x, "authorPhotoURI", value.asInstanceOf[js.Any])
    
    inline def setAuthorPhotoURINull: Self = StObject.set(x, "authorPhotoURI", null)
    
    inline def setAuthorURI(value: String): Self = StObject.set(x, "authorURI", value.asInstanceOf[js.Any])
    
    inline def setAuthorURINull: Self = StObject.set(x, "authorURI", null)
    
    inline def setPublishTime(value: js.Date): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingNull: Self = StObject.set(x, "rating", null)
    
    inline def setRelativePublishTimeDescription(value: String): Self = StObject.set(x, "relativePublishTimeDescription", value.asInstanceOf[js.Any])
    
    inline def setRelativePublishTimeDescriptionNull: Self = StObject.set(x, "relativePublishTimeDescription", null)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextLanguageCode(value: String): Self = StObject.set(x, "textLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTextLanguageCodeNull: Self = StObject.set(x, "textLanguageCode", null)
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
  }
}
