package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePromoofferAccept
  extends StObject
     with StandardParameters {
  
  /**
    * device android_id
    */
  var androidId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * device device
    */
  var device: js.UndefOr[String] = js.undefined
  
  /**
    * device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * device model
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * device product
    */
  var product: js.UndefOr[String] = js.undefined
  
  /**
    * device serial
    */
  var serial: js.UndefOr[String] = js.undefined
  
  /**
    * Volume id to exercise the offer
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePromoofferAccept {
  
  @scala.inline
  def apply(): ParamsResourcePromoofferAccept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePromoofferAccept]
  }
  
  @scala.inline
  implicit class ParamsResourcePromoofferAcceptMutableBuilder[Self <: ParamsResourcePromoofferAccept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
