package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDictionaryListofflinemetadata extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The device/version ID from which to request the data.
    */
  var cpksver: js.UndefOr[String] = js.native
}
object ParamsResourceDictionaryListofflinemetadata {
  
  @scala.inline
  def apply(): ParamsResourceDictionaryListofflinemetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDictionaryListofflinemetadata]
  }
  
  @scala.inline
  implicit class ParamsResourceDictionaryListofflinemetadataMutableBuilder[Self <: ParamsResourceDictionaryListofflinemetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCpksver(value: String): Self = StObject.set(x, "cpksver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpksverUndefined: Self = StObject.set(x, "cpksver", js.undefined)
  }
}
