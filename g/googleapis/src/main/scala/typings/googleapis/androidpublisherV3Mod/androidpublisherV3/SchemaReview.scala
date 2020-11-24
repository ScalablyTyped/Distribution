package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReview extends js.Object {
  
  /**
    * The name of the user who wrote the review.
    */
  var authorName: js.UndefOr[String] = js.native
  
  /**
    * A repeated field containing comments for the review.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.native
  
  /**
    * Unique identifier for this review.
    */
  var reviewId: js.UndefOr[String] = js.native
}
object SchemaReview {
  
  @scala.inline
  def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  
  @scala.inline
  implicit class SchemaReviewOps[Self <: SchemaReview] (val x: Self) extends AnyVal {
    
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
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: SchemaComment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[SchemaComment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setReviewId(value: String): Self = this.set("reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviewId: Self = this.set("reviewId", js.undefined)
  }
}
