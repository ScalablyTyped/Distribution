package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJournal extends StObject {
  
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
object NotaryJournal {
  
  @scala.inline
  def apply(): NotaryJournal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournal]
  }
  
  @scala.inline
  implicit class NotaryJournalMutableBuilder[Self <: NotaryJournal] (val x: Self) extends AnyVal {
    
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
