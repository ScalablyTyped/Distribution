package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A server-stored registry credential used to validate device credentials.
  */
@js.native
trait SchemaRegistryCredential extends StObject {
  
  /**
    * A public key certificate used to verify the device credentials.
    */
  var publicKeyCertificate: js.UndefOr[SchemaPublicKeyCertificate] = js.native
}
object SchemaRegistryCredential {
  
  @scala.inline
  def apply(): SchemaRegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegistryCredential]
  }
  
  @scala.inline
  implicit class SchemaRegistryCredentialMutableBuilder[Self <: SchemaRegistryCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyCertificate(value: SchemaPublicKeyCertificate): Self = StObject.set(x, "publicKeyCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyCertificateUndefined: Self = StObject.set(x, "publicKeyCertificate", js.undefined)
  }
}
