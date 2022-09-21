package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ExtraDescription
import typings.googleapis.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReview extends StObject {
  
  /**
    * Author of this review.
    */
  var author: js.UndefOr[`2` | Null] = js.undefined
  
  /**
    * Review text.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date of this review.
    */
  var date: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for the full review text, for reviews gathered from the web.
    */
  var fullTextUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for a review.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED.
    */
  var rating: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information regarding the source of this review, when the review is not from a Google Books user.
    */
  var source: js.UndefOr[ExtraDescription | Null] = js.undefined
  
  /**
    * Title for this review.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volume that this review is for.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReview {
  
  inline def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  
  extension [Self <: SchemaReview](x: Self) {
    
    inline def setAuthor(value: `2`): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFullTextUrl(value: String): Self = StObject.set(x, "fullTextUrl", value.asInstanceOf[js.Any])
    
    inline def setFullTextUrlNull: Self = StObject.set(x, "fullTextUrl", null)
    
    inline def setFullTextUrlUndefined: Self = StObject.set(x, "fullTextUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingNull: Self = StObject.set(x, "rating", null)
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setSource(value: ExtraDescription): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
