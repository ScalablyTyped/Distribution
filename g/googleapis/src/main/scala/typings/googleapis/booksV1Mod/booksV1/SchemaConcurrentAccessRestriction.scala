package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConcurrentAccessRestriction extends StObject {
  
  /**
    * Whether access is granted for this (user, device, volume).
    */
  var deviceAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of concurrent access licenses for this volume.
    */
  var maxConcurrentDevices: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Error/warning message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client nonce for verification. Download access and client-validation only.
    */
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error/warning reason code.
    */
  var reasonCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this volume has any concurrent access restrictions.
    */
  var restricted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Response signature.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client app identifier for verification. Download access and client-validation only.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time in seconds for license auto-expiration.
    */
  var timeWindowSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Identifies the volume for which this entry applies.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaConcurrentAccessRestriction {
  
  inline def apply(): SchemaConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConcurrentAccessRestriction]
  }
  
  extension [Self <: SchemaConcurrentAccessRestriction](x: Self) {
    
    inline def setDeviceAllowed(value: Boolean): Self = StObject.set(x, "deviceAllowed", value.asInstanceOf[js.Any])
    
    inline def setDeviceAllowedNull: Self = StObject.set(x, "deviceAllowed", null)
    
    inline def setDeviceAllowedUndefined: Self = StObject.set(x, "deviceAllowed", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxConcurrentDevices(value: Double): Self = StObject.set(x, "maxConcurrentDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentDevicesNull: Self = StObject.set(x, "maxConcurrentDevices", null)
    
    inline def setMaxConcurrentDevicesUndefined: Self = StObject.set(x, "maxConcurrentDevices", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeNull: Self = StObject.set(x, "reasonCode", null)
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    inline def setRestrictedNull: Self = StObject.set(x, "restricted", null)
    
    inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimeWindowSeconds(value: Double): Self = StObject.set(x, "timeWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowSecondsNull: Self = StObject.set(x, "timeWindowSeconds", null)
    
    inline def setTimeWindowSecondsUndefined: Self = StObject.set(x, "timeWindowSeconds", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
