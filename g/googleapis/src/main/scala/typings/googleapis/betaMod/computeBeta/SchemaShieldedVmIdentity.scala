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
  
  @scala.inline
  def apply(): SchemaShieldedVmIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIdentity]
  }
  
  @scala.inline
  implicit class SchemaShieldedVmIdentityMutableBuilder[Self <: SchemaShieldedVmIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: SchemaShieldedVmIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSigningKey(value: SchemaShieldedVmIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
