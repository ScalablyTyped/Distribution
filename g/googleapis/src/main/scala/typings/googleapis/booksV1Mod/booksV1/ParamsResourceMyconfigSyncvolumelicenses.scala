package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMyconfigSyncvolumelicenses extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The device/version ID from which to release the restriction.
    */
  var cpksver: js.UndefOr[String] = js.native
  
  /**
    * List of features supported by the client, i.e., 'RENTALS'
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set to true to include non-comics series. Defaults to false.
    */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.native
  
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The client nonce value.
    */
  var nonce: js.UndefOr[String] = js.native
  
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The volume(s) to request download restrictions for.
    */
  var volumeIds: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceMyconfigSyncvolumelicenses {
  
  @scala.inline
  def apply(): ParamsResourceMyconfigSyncvolumelicenses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigSyncvolumelicenses]
  }
  
  @scala.inline
  implicit class ParamsResourceMyconfigSyncvolumelicensesOps[Self <: ParamsResourceMyconfigSyncvolumelicenses] (val x: Self) extends AnyVal {
    
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
    def setCpksver(value: String): Self = this.set("cpksver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpksver: Self = this.set("cpksver", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setIncludeNonComicsSeries(value: Boolean): Self = this.set("includeNonComicsSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNonComicsSeries: Self = this.set("includeNonComicsSeries", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setShowPreorders(value: Boolean): Self = this.set("showPreorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreorders: Self = this.set("showPreorders", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: String*): Self = this.set("volumeIds", js.Array(value :_*))
    
    @scala.inline
    def setVolumeIds(value: js.Array[String]): Self = this.set("volumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeIds: Self = this.set("volumeIds", js.undefined)
  }
}
