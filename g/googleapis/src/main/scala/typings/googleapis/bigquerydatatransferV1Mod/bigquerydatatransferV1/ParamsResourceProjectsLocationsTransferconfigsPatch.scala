package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsTransferconfigsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional OAuth2 authorization code to use with this transfer
    * configuration. If it is provided, the transfer configuration will be
    * associated with the authorizing user. In order to obtain
    * authorization_code, please make a request to
    * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>
    * * client_id should be OAuth client_id of BigQuery DTS API for the given
    * data source returned by ListDataSources method. * data_source_scopes are
    * the scopes returned by ListDataSources method. * redirect_uri is an
    * optional parameter. If not specified, then   authorization code is posted
    * to the opener of authorization flow window.   Otherwise it will be sent
    * to the redirect uri. A special value of   urn:ietf:wg:oauth:2.0:oob means
    * that authorization code should be   returned in the title bar of the
    * browser, with the page text prompting   the user to copy the code and
    * paste it in the application.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the transfer config. Transfer config names have the
    * form of
    * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`.
    * The name is automatically generated based on the config_id specified in
    * CreateTransferConfigRequest along with project_id and region. If
    * config_id is not provided, usually a uuid, even though it is not
    * guaranteed or required, will be generated for config_id.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTransferConfig] = js.native
  
  /**
    * Required list of fields to be updated in this request.
    */
  var updateMask: js.UndefOr[String] = js.native
  
  /**
    * Optional version info. If users want to find a very recent access token,
    * that is, immediately after approving access, users have to set the
    * version_info claim in the token request. To obtain the version_info,
    * users must use the “none+gsession” response type. which be return a
    * version_info back in the authorization response which be be put in a JWT
    * claim in the token request.
    */
  var versionInfo: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsTransferconfigsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsTransferconfigsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTransferconfigsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsTransferconfigsPatchMutableBuilder[Self <: ParamsResourceProjectsLocationsTransferconfigsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaTransferConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
