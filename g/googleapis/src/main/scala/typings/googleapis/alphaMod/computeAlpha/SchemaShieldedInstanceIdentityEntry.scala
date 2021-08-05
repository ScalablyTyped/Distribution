package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Shielded Instance Identity Entry.
  */
trait SchemaShieldedInstanceIdentityEntry extends StObject {
  
  /**
    * A PEM-encoded X.509 certificate. This field can be empty.
    */
  var ekCert: js.UndefOr[String] = js.undefined
  
  /**
    * A PEM-encoded public key.
    */
  var ekPub: js.UndefOr[String] = js.undefined
}
object SchemaShieldedInstanceIdentityEntry {
  
  inline def apply(): SchemaShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentityEntry]
  }
  
  extension [Self <: SchemaShieldedInstanceIdentityEntry](x: Self) {
    
    inline def setEkCert(value: String): Self = StObject.set(x, "ekCert", value.asInstanceOf[js.Any])
    
    inline def setEkCertUndefined: Self = StObject.set(x, "ekCert", js.undefined)
    
    inline def setEkPub(value: String): Self = StObject.set(x, "ekPub", value.asInstanceOf[js.Any])
    
    inline def setEkPubUndefined: Self = StObject.set(x, "ekPub", js.undefined)
  }
}
