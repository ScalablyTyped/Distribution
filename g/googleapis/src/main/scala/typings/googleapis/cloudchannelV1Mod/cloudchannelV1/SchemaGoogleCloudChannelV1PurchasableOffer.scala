package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PurchasableOffer extends StObject {
  
  /**
    * Offer.
    */
  var offer: js.UndefOr[SchemaGoogleCloudChannelV1Offer] = js.undefined
}
object SchemaGoogleCloudChannelV1PurchasableOffer {
  
  inline def apply(): SchemaGoogleCloudChannelV1PurchasableOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PurchasableOffer]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PurchasableOffer](x: Self) {
    
    inline def setOffer(value: SchemaGoogleCloudChannelV1Offer): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    inline def setOfferUndefined: Self = StObject.set(x, "offer", js.undefined)
  }
}
