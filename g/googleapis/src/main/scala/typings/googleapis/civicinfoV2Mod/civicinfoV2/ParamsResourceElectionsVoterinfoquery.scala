package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
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
  implicit class ParamsResourceElectionsVoterinfoqueryOps[Self <: ParamsResourceElectionsVoterinfoquery] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setElectionId(value: String): Self = this.set("electionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectionId: Self = this.set("electionId", js.undefined)
    
    @scala.inline
    def setOfficialOnly(value: Boolean): Self = this.set("officialOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficialOnly: Self = this.set("officialOnly", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaVoterInfoRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setReturnAllAvailableData(value: Boolean): Self = this.set("returnAllAvailableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnAllAvailableData: Self = this.set("returnAllAvailableData", js.undefined)
  }
}
