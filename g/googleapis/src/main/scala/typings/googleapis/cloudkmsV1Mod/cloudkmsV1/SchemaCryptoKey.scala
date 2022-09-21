package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCryptoKey extends StObject {
  
  /**
    * Output only. The time at which this CryptoKey was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format `projects/x/locations/x/ekmConnections/x`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
    */
  var cryptoKeyBackend: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default duration is 24 hours.
    */
  var destroyScheduledDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Whether this key may contain imported versions only.
    */
  var importOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name for this CryptoKey in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[SchemaCryptoKeyVersion] = js.undefined
  
  /**
    * Immutable. The immutable purpose of this CryptoKey.
    */
  var purpose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set, next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are controlled by this template.
    */
  var versionTemplate: js.UndefOr[SchemaCryptoKeyVersionTemplate] = js.undefined
}
object SchemaCryptoKey {
  
  inline def apply(): SchemaCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKey]
  }
  
  extension [Self <: SchemaCryptoKey](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCryptoKeyBackend(value: String): Self = StObject.set(x, "cryptoKeyBackend", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyBackendNull: Self = StObject.set(x, "cryptoKeyBackend", null)
    
    inline def setCryptoKeyBackendUndefined: Self = StObject.set(x, "cryptoKeyBackend", js.undefined)
    
    inline def setDestroyScheduledDuration(value: String): Self = StObject.set(x, "destroyScheduledDuration", value.asInstanceOf[js.Any])
    
    inline def setDestroyScheduledDurationNull: Self = StObject.set(x, "destroyScheduledDuration", null)
    
    inline def setDestroyScheduledDurationUndefined: Self = StObject.set(x, "destroyScheduledDuration", js.undefined)
    
    inline def setImportOnly(value: Boolean): Self = StObject.set(x, "importOnly", value.asInstanceOf[js.Any])
    
    inline def setImportOnlyNull: Self = StObject.set(x, "importOnly", null)
    
    inline def setImportOnlyUndefined: Self = StObject.set(x, "importOnly", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeNull: Self = StObject.set(x, "nextRotationTime", null)
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setPrimary(value: SchemaCryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setRotationPeriodNull: Self = StObject.set(x, "rotationPeriod", null)
    
    inline def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
    
    inline def setVersionTemplate(value: SchemaCryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
    
    inline def setVersionTemplateUndefined: Self = StObject.set(x, "versionTemplate", js.undefined)
  }
}
