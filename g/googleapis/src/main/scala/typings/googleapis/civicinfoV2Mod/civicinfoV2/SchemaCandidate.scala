package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCandidate extends StObject {
  
  /**
    * The URL for the candidate's campaign web site.
    */
  var candidateUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of known (social) media channels for this candidate.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.undefined
  
  /**
    * The email address for the candidate's campaign.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The candidate's name. If this is a joint ticket it will indicate the name of the candidate at the top of a ticket followed by a / and that name of candidate at the bottom of the ticket. e.g. "Mitt Romney / Paul Ryan"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order the candidate appears on the ballot for this contest.
    */
  var orderOnBallot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full name of the party the candidate is a member of.
    */
  var party: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The voice phone number for the candidate's campaign office.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A URL for a photo of the candidate.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaCandidate {
  
  inline def apply(): SchemaCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandidate]
  }
  
  extension [Self <: SchemaCandidate](x: Self) {
    
    inline def setCandidateUrl(value: String): Self = StObject.set(x, "candidateUrl", value.asInstanceOf[js.Any])
    
    inline def setCandidateUrlNull: Self = StObject.set(x, "candidateUrl", null)
    
    inline def setCandidateUrlUndefined: Self = StObject.set(x, "candidateUrl", js.undefined)
    
    inline def setChannels(value: js.Array[SchemaChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaChannel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrderOnBallot(value: String): Self = StObject.set(x, "orderOnBallot", value.asInstanceOf[js.Any])
    
    inline def setOrderOnBallotNull: Self = StObject.set(x, "orderOnBallot", null)
    
    inline def setOrderOnBallotUndefined: Self = StObject.set(x, "orderOnBallot", js.undefined)
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyNull: Self = StObject.set(x, "party", null)
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
