package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProposal extends StObject {
  
  /**
    * Output only. When the client field is populated, this field refers to the buyer who creates and manages the client buyer and gets billed on behalf of the client buyer; when the buyer field is populated, this field is the same value as buyer. Format : `buyers/{buyerAccountId\}`
    */
  var billedBuyer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Refers to a buyer in The Realtime-bidding API. Format: `buyers/{buyerAccountId\}`
    */
  var buyer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contact information for the buyer.
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContact]] = js.undefined
  
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.undefined
  
  /**
    * Output only. Refers to a Client. Format: `buyers/{buyerAccountId\}/clients/{clientAccountid\}`
    */
  var client: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of deal the proposal contains.
    */
  var dealType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The descriptive name for the proposal. Maximum length of 255 unicode characters is allowed. Control characters are not allowed. Buyers cannot update this field. Note: Not to be confused with name, which is a unique identifier of the proposal.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. True if the proposal was previously finalized and is now being renegotiated.
    */
  var isRenegotiating: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The role of the last user that either updated the proposal or left a comment.
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The name of the proposal serving as a unique identifier. Format: buyers/{accountId\}/proposals/{proposalId\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of notes from the buyer and the seller attached to this proposal.
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.undefined
  
  /**
    * Output only. Indicates whether the buyer/seller created the proposal.
    */
  var originatorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether pausing is allowed for the proposal. This is a negotiable term between buyers and publishers.
    */
  var pausingConsented: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The revision number for the proposal. Each update to the proposal or deal causes the proposal revision number to auto-increment. The buyer keeps track of the last revision number they know of and pass it in when making an update. If the head revision number on the server has since incremented, then an ABORTED error is returned during the update operation to let the buyer know that a subsequent update was made.
    */
  var proposalRevision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Reference to the seller on the proposal. Format: `buyers/{buyerAccountId\}/publisherProfiles/{publisherProfileId\}` Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error.
    */
  var publisherProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Contact information for the seller.
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContact]] = js.undefined
  
  /**
    * Output only. Indicates the state of the proposal.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The terms and conditions associated with this proposal. Accepting a proposal implies acceptance of this field. This is created by the seller, the buyer can only view it.
    */
  var termsAndConditions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the proposal was last revised.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaProposal {
  
  inline def apply(): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProposal]
  }
  
  extension [Self <: SchemaProposal](x: Self) {
    
    inline def setBilledBuyer(value: String): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerNull: Self = StObject.set(x, "billedBuyer", null)
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: String): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerContacts(value: js.Array[SchemaContact]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    inline def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    inline def setBuyerContactsVarargs(value: SchemaContact*): Self = StObject.set(x, "buyerContacts", js.Array(value*))
    
    inline def setBuyerNull: Self = StObject.set(x, "buyer", null)
    
    inline def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientNull: Self = StObject.set(x, "client", null)
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDealType(value: String): Self = StObject.set(x, "dealType", value.asInstanceOf[js.Any])
    
    inline def setDealTypeNull: Self = StObject.set(x, "dealType", null)
    
    inline def setDealTypeUndefined: Self = StObject.set(x, "dealType", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsRenegotiating(value: Boolean): Self = StObject.set(x, "isRenegotiating", value.asInstanceOf[js.Any])
    
    inline def setIsRenegotiatingNull: Self = StObject.set(x, "isRenegotiating", null)
    
    inline def setIsRenegotiatingUndefined: Self = StObject.set(x, "isRenegotiating", js.undefined)
    
    inline def setLastUpdaterOrCommentorRole(value: String): Self = StObject.set(x, "lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterOrCommentorRoleNull: Self = StObject.set(x, "lastUpdaterOrCommentorRole", null)
    
    inline def setLastUpdaterOrCommentorRoleUndefined: Self = StObject.set(x, "lastUpdaterOrCommentorRole", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: js.Array[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: SchemaNote*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setOriginatorRole(value: String): Self = StObject.set(x, "originatorRole", value.asInstanceOf[js.Any])
    
    inline def setOriginatorRoleNull: Self = StObject.set(x, "originatorRole", null)
    
    inline def setOriginatorRoleUndefined: Self = StObject.set(x, "originatorRole", js.undefined)
    
    inline def setPausingConsented(value: Boolean): Self = StObject.set(x, "pausingConsented", value.asInstanceOf[js.Any])
    
    inline def setPausingConsentedNull: Self = StObject.set(x, "pausingConsented", null)
    
    inline def setPausingConsentedUndefined: Self = StObject.set(x, "pausingConsented", js.undefined)
    
    inline def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNull: Self = StObject.set(x, "proposalRevision", null)
    
    inline def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
    
    inline def setPublisherProfile(value: String): Self = StObject.set(x, "publisherProfile", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileNull: Self = StObject.set(x, "publisherProfile", null)
    
    inline def setPublisherProfileUndefined: Self = StObject.set(x, "publisherProfile", js.undefined)
    
    inline def setSellerContacts(value: js.Array[SchemaContact]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: SchemaContact*): Self = StObject.set(x, "sellerContacts", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTermsAndConditions(value: String): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    inline def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
