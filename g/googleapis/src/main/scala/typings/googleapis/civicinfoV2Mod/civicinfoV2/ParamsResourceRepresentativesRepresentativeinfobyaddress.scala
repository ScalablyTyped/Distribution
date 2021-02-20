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
  implicit class ParamsResourceRepresentativesRepresentativeinfobyaddressMutableBuilder[Self <: ParamsResourceRepresentativesRepresentativeinfobyaddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeOffices(value: Boolean): Self = StObject.set(x, "includeOffices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOfficesUndefined: Self = StObject.set(x, "includeOffices", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setRequestBody(value: SchemaRepresentativeInfoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
