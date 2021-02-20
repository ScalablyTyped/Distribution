package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersionTemplate extends StObject {
  
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  
  var protectionLevel: ProtectionLevel = js.native
}
object CryptoKeyVersionTemplate {
  
  @scala.inline
  def apply(algorithm: CryptoKeyVersionAlgorithm, protectionLevel: ProtectionLevel): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  
  @scala.inline
  implicit class CryptoKeyVersionTemplateMutableBuilder[Self <: CryptoKeyVersionTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: ProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
  }
}
