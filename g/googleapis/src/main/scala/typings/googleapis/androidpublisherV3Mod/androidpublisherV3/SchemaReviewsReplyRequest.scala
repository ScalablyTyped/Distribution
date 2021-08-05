package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReviewsReplyRequest extends StObject {
  
  /**
    * The text to set as the reply. Replies of more than approximately 350
    * characters will be rejected. HTML tags will be stripped.
    */
  var replyText: js.UndefOr[String] = js.undefined
}
object SchemaReviewsReplyRequest {
  
  inline def apply(): SchemaReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsReplyRequest]
  }
  
  extension [Self <: SchemaReviewsReplyRequest](x: Self) {
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
