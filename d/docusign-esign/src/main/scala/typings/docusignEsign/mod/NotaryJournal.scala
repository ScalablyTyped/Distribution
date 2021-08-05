package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJournal extends StObject {
  
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
object NotaryJournal {
  
  inline def apply(): NotaryJournal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournal]
  }
  
  extension [Self <: NotaryJournal](x: Self) {
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    inline def setJurisdiction(value: Jurisdiction): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setNotaryJournalId(value: String): Self = StObject.set(x, "notaryJournalId", value.asInstanceOf[js.Any])
    
    inline def setNotaryJournalIdUndefined: Self = StObject.set(x, "notaryJournalId", js.undefined)
    
    inline def setNotaryJournalMetaData(value: NotaryJournalMetaData): Self = StObject.set(x, "notaryJournalMetaData", value.asInstanceOf[js.Any])
    
    inline def setNotaryJournalMetaDataUndefined: Self = StObject.set(x, "notaryJournalMetaData", js.undefined)
    
    inline def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
    
    inline def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
  }
}
