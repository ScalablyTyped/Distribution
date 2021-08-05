package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyVersionTemplate extends StObject {
  
  var algorithm: CryptoKeyVersionAlgorithm
  
  var protectionLevel: ProtectionLevel
}
object CryptoKeyVersionTemplate {
  
  inline def apply(algorithm: CryptoKeyVersionAlgorithm, protectionLevel: ProtectionLevel): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  
  extension [Self <: CryptoKeyVersionTemplate](x: Self) {
    
    inline def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevel(value: ProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
  }
}
