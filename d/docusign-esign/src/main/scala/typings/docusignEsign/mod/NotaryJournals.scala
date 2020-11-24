package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJournals extends js.Object {
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  var documentName: js.UndefOr[String] = js.native
  
  var jurisdiction: js.UndefOr[Jurisdiction] = js.native
  
  var notaryJournalId: js.UndefOr[String] = js.native
  
  var notaryJournalMetaData: js.UndefOr[NotaryJournalMetaData] = js.native
  
  /**
    * The in-person signer's full legal name.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `name` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var signerName: js.UndefOr[String] = js.native
}
object NotaryJournals {
  
  @scala.inline
  def apply(): NotaryJournals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournals]
  }
  
  @scala.inline
  implicit class NotaryJournalsOps[Self <: NotaryJournals] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("documentName", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: Jurisdiction): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setNotaryJournalId(value: String): Self = this.set("notaryJournalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotaryJournalId: Self = this.set("notaryJournalId", js.undefined)
    
    @scala.inline
    def setNotaryJournalMetaData(value: NotaryJournalMetaData): Self = this.set("notaryJournalMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotaryJournalMetaData: Self = this.set("notaryJournalMetaData", js.undefined)
    
    @scala.inline
    def setSignerName(value: String): Self = this.set("signerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerName: Self = this.set("signerName", js.undefined)
  }
}
