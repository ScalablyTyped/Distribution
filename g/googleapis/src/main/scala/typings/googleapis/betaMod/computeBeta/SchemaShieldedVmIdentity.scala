package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A shielded VM identity entry.
  */
trait SchemaShieldedVmIdentity extends StObject {
  
  /**
    * An Endorsement Key (EK) issued to the Shielded VM&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedVmIdentityEntry] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#shieldedVmIdentity for
    * shielded VM identity entry.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An Attestation Key (AK) issued to the Shielded VM&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedVmIdentityEntry] = js.undefined
}
object SchemaShieldedVmIdentity {
  
  inline def apply(): SchemaShieldedVmIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIdentity]
  }
  
  extension [Self <: SchemaShieldedVmIdentity](x: Self) {
    
    inline def setEncryptionKey(value: SchemaShieldedVmIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSigningKey(value: SchemaShieldedVmIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
