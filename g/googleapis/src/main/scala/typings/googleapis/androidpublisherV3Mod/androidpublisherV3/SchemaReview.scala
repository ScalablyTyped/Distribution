package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReview extends StObject {
  
  /**
    * The name of the user who wrote the review.
    */
  var authorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A repeated field containing comments for the review.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * Unique identifier for this review.
    */
  var reviewId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReview {
  
  inline def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  
  extension [Self <: SchemaReview](x: Self) {
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameNull: Self = StObject.set(x, "authorName", null)
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setComments(value: js.Array[SchemaComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: SchemaComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setReviewId(value: String): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setReviewIdNull: Self = StObject.set(x, "reviewId", null)
    
    inline def setReviewIdUndefined: Self = StObject.set(x, "reviewId", js.undefined)
  }
}
