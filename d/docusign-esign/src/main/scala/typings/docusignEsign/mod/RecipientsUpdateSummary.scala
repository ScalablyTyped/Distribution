package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientsUpdateSummary extends StObject {
  
  /**
    * An array of `recipientUpdateResults` objects that contain details about the recipients.
    */
  var recipientUpdateResults: js.UndefOr[
    js.Array[
      /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
    ]
  ] = js.undefined
}
object RecipientsUpdateSummary {
  
  @scala.inline
  def apply(): RecipientsUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientsUpdateSummary]
  }
  
  @scala.inline
  implicit class RecipientsUpdateSummaryMutableBuilder[Self <: RecipientsUpdateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipientUpdateResults(
      value: js.Array[
          /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
        ]
    ): Self = StObject.set(x, "recipientUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUpdateResultsUndefined: Self = StObject.set(x, "recipientUpdateResults", js.undefined)
    
    @scala.inline
    def setRecipientUpdateResultsVarargs(
      value: (/* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse)*
    ): Self = StObject.set(x, "recipientUpdateResults", js.Array(value :_*))
  }
}
