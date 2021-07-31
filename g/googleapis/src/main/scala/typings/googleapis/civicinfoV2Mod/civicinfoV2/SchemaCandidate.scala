package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a candidate running for elected office.
  */
trait SchemaCandidate extends StObject {
  
  /**
    * The URL for the candidate&#39;s campaign web site.
    */
  var candidateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A list of known (social) media channels for this candidate.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.undefined
  
  /**
    * The email address for the candidate&#39;s campaign.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The candidate&#39;s name. If this is a joint ticket it will indicate the
    * name of the candidate at the top of a ticket followed by a / and that
    * name of candidate at the bottom of the ticket. e.g. &quot;Mitt Romney /
    * Paul Ryan&quot;
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The order the candidate appears on the ballot for this contest.
    */
  var orderOnBallot: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the party the candidate is a member of.
    */
  var party: js.UndefOr[String] = js.undefined
  
  /**
    * The voice phone number for the candidate&#39;s campaign office.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * A URL for a photo of the candidate.
    */
  var photoUrl: js.UndefOr[String] = js.undefined
}
object SchemaCandidate {
  
  @scala.inline
  def apply(): SchemaCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandidate]
  }
  
  @scala.inline
  implicit class SchemaCandidateMutableBuilder[Self <: SchemaCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidateUrl(value: String): Self = StObject.set(x, "candidateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateUrlUndefined: Self = StObject.set(x, "candidateUrl", js.undefined)
    
    @scala.inline
    def setChannels(value: js.Array[SchemaChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: SchemaChannel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrderOnBallot(value: String): Self = StObject.set(x, "orderOnBallot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderOnBallotUndefined: Self = StObject.set(x, "orderOnBallot", js.undefined)
    
    @scala.inline
    def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
