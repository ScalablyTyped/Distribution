package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientsUpdateSummary extends js.Object {
  
  /**
    * An array of `recipientUpdateResults` objects that contain details about the recipients.
    */
  var recipientUpdateResults: js.UndefOr[
    js.Array[
      /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
    ]
  ] = js.native
}
object RecipientsUpdateSummary {
  
  @scala.inline
  def apply(): RecipientsUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientsUpdateSummary]
  }
  
  @scala.inline
  implicit class RecipientsUpdateSummaryOps[Self <: RecipientsUpdateSummary] (val x: Self) extends AnyVal {
    
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
    def setRecipientUpdateResultsVarargs(
      value: (/* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse)*
    ): Self = this.set("recipientUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setRecipientUpdateResults(
      value: js.Array[
          /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
        ]
    ): Self = this.set("recipientUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUpdateResults: Self = this.set("recipientUpdateResults", js.undefined)
  }
}
