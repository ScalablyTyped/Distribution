package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CryptoKey represents a logical key that can be used for cryptographic
  * operations.  A CryptoKey is made up of one or more versions, which
  * represent the actual key material used in cryptographic operations.
  */
@js.native
trait SchemaCryptoKey extends StObject {
  
  /**
    * Output only. The time at which this CryptoKey was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Labels with user-defined metadata. For more information, see [Labeling
    * Keys](/kms/docs/labeling-keys).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * At next_rotation_time, the Key Management Service will automatically:  1.
    * Create a new version of this CryptoKey. 2. Mark the new version as
    * primary.  Key rotations performed manually via CreateCryptoKeyVersion and
    * UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time.  Keys
    * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys,
    * this field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. A copy of the &quot;primary&quot; CryptoKeyVersion that will
    * be used by Encrypt when this CryptoKey is given in EncryptRequest.name.
    * The CryptoKey&#39;s primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.  All keys with purpose ENCRYPT_DECRYPT
    * have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[SchemaCryptoKeyVersion] = js.native
  
  /**
    * The immutable purpose of this CryptoKey.
    */
  var purpose: js.UndefOr[String] = js.native
  
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.  If
    * rotation_period is set, next_rotation_time must also be set.  Keys with
    * purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this
    * field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
  
  /**
    * A template describing settings for new CryptoKeyVersion instances. The
    * properties of new CryptoKeyVersion instances created by either
    * CreateCryptoKeyVersion or auto-rotation are controlled by this template.
    */
  var versionTemplate: js.UndefOr[SchemaCryptoKeyVersionTemplate] = js.native
}
object SchemaCryptoKey {
  
  @scala.inline
  def apply(): SchemaCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKey]
  }
  
  @scala.inline
  implicit class SchemaCryptoKeyMutableBuilder[Self <: SchemaCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    @scala.inline
    def setPrimary(value: SchemaCryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
    
    @scala.inline
    def setVersionTemplate(value: SchemaCryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTemplateUndefined: Self = StObject.set(x, "versionTemplate", js.undefined)
  }
}
