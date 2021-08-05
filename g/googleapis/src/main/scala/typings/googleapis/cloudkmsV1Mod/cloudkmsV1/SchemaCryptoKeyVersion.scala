package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CryptoKeyVersion represents an individual cryptographic key, and the
  * associated key material.  An ENABLED version can be used for cryptographic
  * operations.  For security reasons, the raw cryptographic key material
  * represented by a CryptoKeyVersion can never be viewed or exported. It can
  * only be used to encrypt, decrypt, or sign data when an authorized user or
  * application invokes Cloud KMS.
  */
trait SchemaCryptoKeyVersion extends StObject {
  
  /**
    * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion
    * supports.
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Statement that was generated and signed by the HSM at key
    * creation time. Use this statement to verify attributes of the key as
    * stored on the HSM, independently of Google. Only provided for key
    * versions with protection_level HSM.
    */
  var attestation: js.UndefOr[SchemaKeyOperationAttestation] = js.undefined
  
  /**
    * Output only. The time at which this CryptoKeyVersion was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * destroyed. Only present if state is DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material is
    * scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * generated.
    */
  var generateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The ProtectionLevel describing how crypto operations are
    * performed with this CryptoKeyVersion.
    */
  var protectionLevel: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the CryptoKeyVersion.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaCryptoKeyVersion {
  
  inline def apply(): SchemaCryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKeyVersion]
  }
  
  extension [Self <: SchemaCryptoKeyVersion](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAttestation(value: SchemaKeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestroyEventTime(value: String): Self = StObject.set(x, "destroyEventTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyEventTimeUndefined: Self = StObject.set(x, "destroyEventTime", js.undefined)
    
    inline def setDestroyTime(value: String): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    inline def setGenerateTime(value: String): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    inline def setGenerateTimeUndefined: Self = StObject.set(x, "generateTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
