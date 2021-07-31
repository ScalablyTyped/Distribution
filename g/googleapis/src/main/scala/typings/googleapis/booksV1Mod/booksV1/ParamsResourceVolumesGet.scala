package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to include non-comics series. Defaults to false.
    */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Brand results for partner ID.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var user_library_consistent_read: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of volume to retrieve.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceVolumesGet {
  
  @scala.inline
  def apply(): ParamsResourceVolumesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceVolumesGetMutableBuilder[Self <: ParamsResourceVolumesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setIncludeNonComicsSeries(value: Boolean): Self = StObject.set(x, "includeNonComicsSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNonComicsSeriesUndefined: Self = StObject.set(x, "includeNonComicsSeries", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUser_library_consistent_read(value: Boolean): Self = StObject.set(x, "user_library_consistent_read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_library_consistent_readUndefined: Self = StObject.set(x, "user_library_consistent_read", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
