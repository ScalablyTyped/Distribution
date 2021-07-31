package typings.googleapis.betaMod.computeBeta

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
  
  @scala.inline
  def apply(): SchemaShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentityEntry]
  }
  
  @scala.inline
  implicit class SchemaShieldedInstanceIdentityEntryMutableBuilder[Self <: SchemaShieldedInstanceIdentityEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEkCert(value: String): Self = StObject.set(x, "ekCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEkCertUndefined: Self = StObject.set(x, "ekCert", js.undefined)
    
    @scala.inline
    def setEkPub(value: String): Self = StObject.set(x, "ekPub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEkPubUndefined: Self = StObject.set(x, "ekPub", js.undefined)
  }
}
