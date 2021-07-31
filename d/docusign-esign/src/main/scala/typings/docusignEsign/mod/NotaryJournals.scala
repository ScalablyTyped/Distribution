package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJournals extends StObject {
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  var documentName: js.UndefOr[String] = js.undefined
  
  var jurisdiction: js.UndefOr[Jurisdiction] = js.undefined
  
  var notaryJournalId: js.UndefOr[String] = js.undefined
  
  var notaryJournalMetaData: js.UndefOr[NotaryJournalMetaData] = js.undefined
  
  /**
    * The in-person signer's full legal name.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `name` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var signerName: js.UndefOr[String] = js.undefined
}
object NotaryJournals {
  
  @scala.inline
  def apply(): NotaryJournals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournals]
  }
  
  @scala.inline
  implicit class NotaryJournalsMutableBuilder[Self <: NotaryJournals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: Jurisdiction): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setNotaryJournalId(value: String): Self = StObject.set(x, "notaryJournalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotaryJournalIdUndefined: Self = StObject.set(x, "notaryJournalId", js.undefined)
    
    @scala.inline
    def setNotaryJournalMetaData(value: NotaryJournalMetaData): Self = StObject.set(x, "notaryJournalMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotaryJournalMetaDataUndefined: Self = StObject.set(x, "notaryJournalMetaData", js.undefined)
    
    @scala.inline
    def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
  }
}
