package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A shielded Instance identity entry.
  */
trait SchemaShieldedInstanceIdentity extends StObject {
  
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.undefined
}
object SchemaShieldedInstanceIdentity {
  
  inline def apply(): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
  
  extension [Self <: SchemaShieldedInstanceIdentity](x: Self) {
    
    inline def setEncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
