package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The paths to the mounted TLS Certificates and private key.
  */
trait SchemaTlsCertificatePaths extends StObject {
  
  /**
    * The path to the file holding the client or server TLS certificate to use.
    */
  var certificatePath: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the file holding the client or server private key.
    */
  var privateKeyPath: js.UndefOr[String] = js.undefined
}
object SchemaTlsCertificatePaths {
  
  @scala.inline
  def apply(): SchemaTlsCertificatePaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificatePaths]
  }
  
  @scala.inline
  implicit class SchemaTlsCertificatePathsMutableBuilder[Self <: SchemaTlsCertificatePaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    @scala.inline
    def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
  }
}
