package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReviewsReplyRequest extends StObject {
  
  /**
    * The text to set as the reply. Replies of more than approximately 350
    * characters will be rejected. HTML tags will be stripped.
    */
  var replyText: js.UndefOr[String] = js.native
}
object SchemaReviewsReplyRequest {
  
  @scala.inline
  def apply(): SchemaReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsReplyRequest]
  }
  
  @scala.inline
  implicit class SchemaReviewsReplyRequestMutableBuilder[Self <: SchemaReviewsReplyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
