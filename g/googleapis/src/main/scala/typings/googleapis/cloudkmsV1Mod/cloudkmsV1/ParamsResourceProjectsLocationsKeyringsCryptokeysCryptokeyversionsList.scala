package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional limit on the number of CryptoKeyVersions to include in the
    * response. Further CryptoKeyVersions can subsequently be obtained by
    * including the ListCryptoKeyVersionsResponse.next_page_token in a
    * subsequent request. If unspecified, the server will pick an appropriate
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeyVersionsResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the CryptoKey to list, in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The fields to include in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
