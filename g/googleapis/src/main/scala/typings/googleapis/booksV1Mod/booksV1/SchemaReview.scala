package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ExtraDescription
import typings.googleapis.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReview extends StObject {
  
  /**
    * Author of this review.
    */
  var author: js.UndefOr[`2`] = js.native
  
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
  var source: js.UndefOr[ExtraDescription] = js.native
  
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
  def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  
  @scala.inline
  implicit class SchemaReviewMutableBuilder[Self <: SchemaReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: `2`): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFullTextUrl(value: String): Self = StObject.set(x, "fullTextUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextUrlUndefined: Self = StObject.set(x, "fullTextUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setSource(value: ExtraDescription): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
