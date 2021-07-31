package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInappproductsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Unique identifier for the Android app with the in-app product; for
    * example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the in-app product.
    */
  var sku: js.UndefOr[String] = js.undefined
}
object ParamsResourceInappproductsDelete {
  
  @scala.inline
  def apply(): ParamsResourceInappproductsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInappproductsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceInappproductsDeleteMutableBuilder[Self <: ParamsResourceInappproductsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
