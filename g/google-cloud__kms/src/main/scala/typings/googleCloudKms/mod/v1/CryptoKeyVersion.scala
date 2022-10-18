package typings.googleCloudKms.mod.v1

import typings.googleProtobuf.googleProtobufTimestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyVersion extends StObject {
  
  var algorithm: CryptoKeyVersionAlgorithm
  
  var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
  
  var createTime: AsObject
  
  var destroyEventTime: js.UndefOr[AsObject] = js.undefined
  
  var destroyTime: js.UndefOr[AsObject] = js.undefined
  
  var generateTime: AsObject
  
  var name: String
  
  var protectionLevel: ProtectionLevel
  
  var state: CryptoKeyVersionState
}
object CryptoKeyVersion {
  
  inline def apply(
    algorithm: CryptoKeyVersionAlgorithm,
    createTime: AsObject,
    generateTime: AsObject,
    name: String,
    protectionLevel: ProtectionLevel,
    state: CryptoKeyVersionState
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], generateTime = generateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersion]
  }
  
  extension [Self <: CryptoKeyVersion](x: Self) {
    
    inline def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAttestation(value: KeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyEventTime(value: AsObject): Self = StObject.set(x, "destroyEventTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyEventTimeUndefined: Self = StObject.set(x, "destroyEventTime", js.undefined)
    
    inline def setDestroyTime(value: AsObject): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    inline def setGenerateTime(value: AsObject): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevel(value: ProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setState(value: CryptoKeyVersionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
