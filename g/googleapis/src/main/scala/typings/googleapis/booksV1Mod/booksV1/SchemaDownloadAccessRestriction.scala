package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDownloadAccessRestriction extends StObject {
  
  /**
    * If restricted, whether access is granted for this (user, device, volume).
    */
  var deviceAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If restricted, the number of content download licenses already acquired
    * (including the requesting client, if licensed).
    */
  var downloadsAcquired: js.UndefOr[Double] = js.undefined
  
  /**
    * If deviceAllowed, whether access was just acquired with this request.
    */
  var justAcquired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * If restricted, the maximum number of content download licenses for this
    * volume.
    */
  var maxDownloadDevices: js.UndefOr[Double] = js.undefined
  
  /**
    * Error/warning message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Client nonce for verification. Download access and client-validation
    * only.
    */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * Error/warning reason code. Additional codes may be added in the future. 0
    * OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200
    * WARNING_USED_LAST_ACCESS
    */
  var reasonCode: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this volume has any download access restrictions.
    */
  var restricted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Response signature.
    */
  var signature: js.UndefOr[String] = js.undefined
  
  /**
    * Client app identifier for verification. Download access and
    * client-validation only.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the volume for which this entry applies.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object SchemaDownloadAccessRestriction {
  
  inline def apply(): SchemaDownloadAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccessRestriction]
  }
  
  extension [Self <: SchemaDownloadAccessRestriction](x: Self) {
    
    inline def setDeviceAllowed(value: Boolean): Self = StObject.set(x, "deviceAllowed", value.asInstanceOf[js.Any])
    
    inline def setDeviceAllowedUndefined: Self = StObject.set(x, "deviceAllowed", js.undefined)
    
    inline def setDownloadsAcquired(value: Double): Self = StObject.set(x, "downloadsAcquired", value.asInstanceOf[js.Any])
    
    inline def setDownloadsAcquiredUndefined: Self = StObject.set(x, "downloadsAcquired", js.undefined)
    
    inline def setJustAcquired(value: Boolean): Self = StObject.set(x, "justAcquired", value.asInstanceOf[js.Any])
    
    inline def setJustAcquiredUndefined: Self = StObject.set(x, "justAcquired", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxDownloadDevices(value: Double): Self = StObject.set(x, "maxDownloadDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxDownloadDevicesUndefined: Self = StObject.set(x, "maxDownloadDevices", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
