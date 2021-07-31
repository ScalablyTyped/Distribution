package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional limit on the number of CryptoKeys to include in the response.
    * Further CryptoKeys can subsequently be obtained by including the
    * ListCryptoKeysResponse.next_page_token in a subsequent request.  If
    * unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeysResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the KeyRing to list, in the format
    * `projects/x/locations/x/keyRings/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The fields of the primary version to include in the response.
    */
  var versionView: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsKeyringsCryptokeysListMutableBuilder[Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setVersionView(value: String): Self = StObject.set(x, "versionView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionViewUndefined: Self = StObject.set(x, "versionView", js.undefined)
  }
}
