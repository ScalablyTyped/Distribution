package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReviewsReplyResponse extends StObject {
  
  var result: js.UndefOr[SchemaReviewReplyResult] = js.undefined
}
object SchemaReviewsReplyResponse {
  
  @scala.inline
  def apply(): SchemaReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsReplyResponse]
  }
  
  @scala.inline
  implicit class SchemaReviewsReplyResponseMutableBuilder[Self <: SchemaReviewsReplyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaReviewReplyResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
