package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedVmIdentityEntry extends StObject {
  
  /**
    * A PEM-encoded X.509 certificate. This field can be empty.
    */
  var ekCert: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A PEM-encoded public key.
    */
  var ekPub: js.UndefOr[String | Null] = js.undefined
}
object SchemaShieldedVmIdentityEntry {
  
  inline def apply(): SchemaShieldedVmIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIdentityEntry]
  }
  
  extension [Self <: SchemaShieldedVmIdentityEntry](x: Self) {
    
    inline def setEkCert(value: String): Self = StObject.set(x, "ekCert", value.asInstanceOf[js.Any])
    
    inline def setEkCertNull: Self = StObject.set(x, "ekCert", null)
    
    inline def setEkCertUndefined: Self = StObject.set(x, "ekCert", js.undefined)
    
    inline def setEkPub(value: String): Self = StObject.set(x, "ekPub", value.asInstanceOf[js.Any])
    
    inline def setEkPubNull: Self = StObject.set(x, "ekPub", null)
    
    inline def setEkPubUndefined: Self = StObject.set(x, "ekPub", js.undefined)
  }
}
