package typings.googleCloudKms.mod.v1

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersion extends StObject {
  
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  
  var attestation: js.UndefOr[KeyOperationAttestation] = js.native
  
  var createTime: AsObject = js.native
  
  var destroyEventTime: js.UndefOr[AsObject] = js.native
  
  var destroyTime: js.UndefOr[AsObject] = js.native
  
  var generateTime: AsObject = js.native
  
  var name: String = js.native
  
  var protectionLevel: ProtectionLevel = js.native
  
  var state: CryptoKeyVersionState = js.native
}
object CryptoKeyVersion {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CryptoKeyVersionMutableBuilder[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestation(value: KeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    @scala.inline
    def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyEventTime(value: AsObject): Self = StObject.set(x, "destroyEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyEventTimeUndefined: Self = StObject.set(x, "destroyEventTime", js.undefined)
    
    @scala.inline
    def setDestroyTime(value: AsObject): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    @scala.inline
    def setGenerateTime(value: AsObject): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: ProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CryptoKeyVersionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
