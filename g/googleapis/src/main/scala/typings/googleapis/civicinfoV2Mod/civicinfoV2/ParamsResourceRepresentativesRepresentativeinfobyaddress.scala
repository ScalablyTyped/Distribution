package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRepresentativesRepresentativeinfobyaddress extends StandardParameters {
  
  /**
    * The address to look up. May only be specified if the field ocdId is not
    * given in the URL.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Whether to return information about offices and officials. If false, only
    * the top-level district information will be returned.
    */
  var includeOffices: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of office levels to filter by. Only offices that serve at least
    * one of these levels will be returned. Divisions that don't contain a
    * matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRepresentativeInfoRequest] = js.native
  
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these
    * roles will be returned. Divisions that don't contain a matching office
    * will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceRepresentativesRepresentativeinfobyaddress {
  
  @scala.inline
  def apply(): ParamsResourceRepresentativesRepresentativeinfobyaddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobyaddress]
  }
  
  @scala.inline
  implicit class ParamsResourceRepresentativesRepresentativeinfobyaddressOps[Self <: ParamsResourceRepresentativesRepresentativeinfobyaddress] (val x: Self) extends AnyVal {
    
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
    def setIncludeOffices(value: Boolean): Self = this.set("includeOffices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOffices: Self = this.set("includeOffices", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: String*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[String]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaRepresentativeInfoRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
}
