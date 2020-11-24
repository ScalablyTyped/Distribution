package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The paths to the mounted TLS Certificates and private key.
  */
@js.native
trait SchemaTlsCertificatePaths extends js.Object {
  
  /**
    * The path to the file holding the client or server TLS certificate to use.
    */
  var certificatePath: js.UndefOr[String] = js.native
  
  /**
    * The path to the file holding the client or server private key.
    */
  var privateKeyPath: js.UndefOr[String] = js.native
}
object SchemaTlsCertificatePaths {
  
  @scala.inline
  def apply(): SchemaTlsCertificatePaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificatePaths]
  }
  
  @scala.inline
  implicit class SchemaTlsCertificatePathsOps[Self <: SchemaTlsCertificatePaths] (val x: Self) extends AnyVal {
    
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
    def setCertificatePath(value: String): Self = this.set("certificatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePath: Self = this.set("certificatePath", js.undefined)
    
    @scala.inline
    def setPrivateKeyPath(value: String): Self = this.set("privateKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyPath: Self = this.set("privateKeyPath", js.undefined)
  }
}
