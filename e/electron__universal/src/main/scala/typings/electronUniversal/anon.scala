package typings.electronUniversal

import typings.electronUniversal.electronUniversalStrings.SHA256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: SHA256
    
    var hash: String
  }
  object Algorithm {
    
    inline def apply(hash: String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = "SHA256", hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: SHA256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
}
