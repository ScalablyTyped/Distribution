package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReviewsListResponse extends StObject {
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  
  var reviews: js.UndefOr[js.Array[SchemaReview]] = js.native
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}
object SchemaReviewsListResponse {
  
  @scala.inline
  def apply(): SchemaReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsListResponse]
  }
  
  @scala.inline
  implicit class SchemaReviewsListResponseMutableBuilder[Self <: SchemaReviewsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setReviews(value: js.Array[SchemaReview]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: SchemaReview*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
