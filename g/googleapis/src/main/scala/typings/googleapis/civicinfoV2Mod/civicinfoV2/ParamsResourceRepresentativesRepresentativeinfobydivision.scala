package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepresentativesRepresentativeinfobydivision
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A list of office levels to filter by. Only offices that serve at least
    * one of these levels will be returned. Divisions that don't contain a
    * matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The Open Civic Data division identifier of the division to look up.
    */
  var ocdId: js.UndefOr[String] = js.undefined
  
  /**
    * If true, information about all divisions contained in the division
    * requested will be included as well. For example, if querying
    * ocd-division/country:us/district:dc, this would also return all DC's
    * wards and ANCs.
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDivisionRepresentativeInfoRequest] = js.undefined
  
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these
    * roles will be returned. Divisions that don't contain a matching office
    * will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceRepresentativesRepresentativeinfobydivision {
  
  @scala.inline
  def apply(): ParamsResourceRepresentativesRepresentativeinfobydivision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobydivision]
  }
  
  @scala.inline
  implicit class ParamsResourceRepresentativesRepresentativeinfobydivisionMutableBuilder[Self <: ParamsResourceRepresentativesRepresentativeinfobydivision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setOcdId(value: String): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDivisionRepresentativeInfoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
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
