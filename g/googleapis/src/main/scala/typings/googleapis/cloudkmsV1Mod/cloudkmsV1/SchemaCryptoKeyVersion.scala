package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCryptoKeyVersion extends StObject {
  
  /**
    * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
    */
  var attestation: js.UndefOr[SchemaKeyOperationAttestation] = js.undefined
  
  /**
    * Output only. The time at which this CryptoKeyVersion was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
    */
  var externalProtectionLevelOptions: js.UndefOr[SchemaExternalProtectionLevelOptions] = js.undefined
  
  /**
    * Output only. The time this CryptoKeyVersion's key material was generated.
    */
  var generateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
    */
  var importFailureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
    */
  var importJob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which this CryptoKeyVersion's key material was most recently imported.
    */
  var importTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
    */
  var reimportEligible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The current state of the CryptoKeyVersion.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaCryptoKeyVersion {
  
  inline def apply(): SchemaCryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKeyVersion]
  }
  
  extension [Self <: SchemaCryptoKeyVersion](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAttestation(value: SchemaKeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestroyEventTime(value: String): Self = StObject.set(x, "destroyEventTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyEventTimeNull: Self = StObject.set(x, "destroyEventTime", null)
    
    inline def setDestroyEventTimeUndefined: Self = StObject.set(x, "destroyEventTime", js.undefined)
    
    inline def setDestroyTime(value: String): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyTimeNull: Self = StObject.set(x, "destroyTime", null)
    
    inline def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    inline def setExternalProtectionLevelOptions(value: SchemaExternalProtectionLevelOptions): Self = StObject.set(x, "externalProtectionLevelOptions", value.asInstanceOf[js.Any])
    
    inline def setExternalProtectionLevelOptionsUndefined: Self = StObject.set(x, "externalProtectionLevelOptions", js.undefined)
    
    inline def setGenerateTime(value: String): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    inline def setGenerateTimeNull: Self = StObject.set(x, "generateTime", null)
    
    inline def setGenerateTimeUndefined: Self = StObject.set(x, "generateTime", js.undefined)
    
    inline def setImportFailureReason(value: String): Self = StObject.set(x, "importFailureReason", value.asInstanceOf[js.Any])
    
    inline def setImportFailureReasonNull: Self = StObject.set(x, "importFailureReason", null)
    
    inline def setImportFailureReasonUndefined: Self = StObject.set(x, "importFailureReason", js.undefined)
    
    inline def setImportJob(value: String): Self = StObject.set(x, "importJob", value.asInstanceOf[js.Any])
    
    inline def setImportJobNull: Self = StObject.set(x, "importJob", null)
    
    inline def setImportJobUndefined: Self = StObject.set(x, "importJob", js.undefined)
    
    inline def setImportTime(value: String): Self = StObject.set(x, "importTime", value.asInstanceOf[js.Any])
    
    inline def setImportTimeNull: Self = StObject.set(x, "importTime", null)
    
    inline def setImportTimeUndefined: Self = StObject.set(x, "importTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setReimportEligible(value: Boolean): Self = StObject.set(x, "reimportEligible", value.asInstanceOf[js.Any])
    
    inline def setReimportEligibleNull: Self = StObject.set(x, "reimportEligible", null)
    
    inline def setReimportEligibleUndefined: Self = StObject.set(x, "reimportEligible", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
