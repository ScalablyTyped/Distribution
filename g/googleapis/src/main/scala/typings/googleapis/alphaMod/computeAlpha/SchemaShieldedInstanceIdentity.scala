package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedInstanceIdentity extends StObject {
  
  /**
    * An Endorsement Key (EK) made by the ECC P256 algorithm issued to the Shielded Instance's vTPM.
    */
  var eccP256EncryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
  
  /**
    * An Attestation Key (AK) made by the ECC P256 algorithm issued to the Shielded Instance's vTPM.
    */
  var eccP256SigningKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
  
  /**
    * An Endorsement Key (EK) made by the RSA 2048 algorithm issued to the Shielded Instance's vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An Attestation Key (AK) made by the RSA 2048 algorithm issued to the Shielded Instance's vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
}
object SchemaShieldedInstanceIdentity {
  
  inline def apply(): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
  
  extension [Self <: SchemaShieldedInstanceIdentity](x: Self) {
    
    inline def setEccP256EncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "eccP256EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEccP256EncryptionKeyUndefined: Self = StObject.set(x, "eccP256EncryptionKey", js.undefined)
    
    inline def setEccP256SigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "eccP256SigningKey", value.asInstanceOf[js.Any])
    
    inline def setEccP256SigningKeyUndefined: Self = StObject.set(x, "eccP256SigningKey", js.undefined)
    
    inline def setEncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
