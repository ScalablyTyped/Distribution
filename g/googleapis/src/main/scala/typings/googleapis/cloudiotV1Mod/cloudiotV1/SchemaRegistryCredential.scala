package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegistryCredential extends StObject {
  
  /**
    * A public key certificate used to verify the device credentials.
    */
  var publicKeyCertificate: js.UndefOr[SchemaPublicKeyCertificate] = js.undefined
}
object SchemaRegistryCredential {
  
  inline def apply(): SchemaRegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegistryCredential]
  }
  
  extension [Self <: SchemaRegistryCredential](x: Self) {
    
    inline def setPublicKeyCertificate(value: SchemaPublicKeyCertificate): Self = StObject.set(x, "publicKeyCertificate", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyCertificateUndefined: Self = StObject.set(x, "publicKeyCertificate", js.undefined)
  }
}
