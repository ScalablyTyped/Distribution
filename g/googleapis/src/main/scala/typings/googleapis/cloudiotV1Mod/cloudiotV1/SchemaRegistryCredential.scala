package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A server-stored registry credential used to validate device credentials.
  */
@js.native
trait SchemaRegistryCredential extends js.Object {
  
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
  implicit class SchemaRegistryCredentialOps[Self <: SchemaRegistryCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublicKeyCertificate(value: SchemaPublicKeyCertificate): Self = this.set("publicKeyCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyCertificate: Self = this.set("publicKeyCertificate", js.undefined)
  }
}
