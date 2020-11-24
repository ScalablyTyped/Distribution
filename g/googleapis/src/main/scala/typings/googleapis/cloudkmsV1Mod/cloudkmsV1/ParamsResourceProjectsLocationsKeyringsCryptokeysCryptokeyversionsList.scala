package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional limit on the number of CryptoKeyVersions to include in the
    * response. Further CryptoKeyVersions can subsequently be obtained by
    * including the ListCryptoKeyVersionsResponse.next_page_token in a
    * subsequent request. If unspecified, the server will pick an appropriate
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeyVersionsResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name of the CryptoKey to list, in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The fields to include in the response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsListOps[Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
