package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceElectionsVoterinfoquery extends StandardParameters {
  
  /**
    * The registered address of the voter to look up.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The unique ID of the election to look up. A list of election IDs can be
    * obtained at https://www.googleapis.com/civicinfo/{version}/electionsIf no
    * election ID is specified in the query and there is more than one election
    * with data for the given voter, the additional elections are provided in
    * the otherElections response field.
    */
  var electionId: js.UndefOr[String] = js.native
  
  /**
    * If set to true, only data from official state sources will be returned.
    */
  var officialOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVoterInfoRequest] = js.native
  
  /**
    * If set to true, the query will return the success codeand include any
    * partial information when it is unable to determine a matching address or
    * unable to determine the election for electionId=0 queries.
    */
  var returnAllAvailableData: js.UndefOr[Boolean] = js.native
}
object ParamsResourceElectionsVoterinfoquery {
  
  @scala.inline
  def apply(): ParamsResourceElectionsVoterinfoquery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceElectionsVoterinfoquery]
  }
  
  @scala.inline
  implicit class ParamsResourceElectionsVoterinfoqueryMutableBuilder[Self <: ParamsResourceElectionsVoterinfoquery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setElectionId(value: String): Self = StObject.set(x, "electionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionIdUndefined: Self = StObject.set(x, "electionId", js.undefined)
    
    @scala.inline
    def setOfficialOnly(value: Boolean): Self = StObject.set(x, "officialOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialOnlyUndefined: Self = StObject.set(x, "officialOnly", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaVoterInfoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setReturnAllAvailableData(value: Boolean): Self = StObject.set(x, "returnAllAvailableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAllAvailableDataUndefined: Self = StObject.set(x, "returnAllAvailableData", js.undefined)
  }
}
