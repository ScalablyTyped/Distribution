package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAConfig extends StObject {
  
  var ExternalCAs: js.UndefOr[js.Array[ExternalCA]] = js.undefined
  
  var ForceRotate: js.UndefOr[Double] = js.undefined
  
  var NodeCertExpiry: js.UndefOr[Duration] = js.undefined
  
  var SigningCACert: js.UndefOr[String] = js.undefined
  
  var SigningCAKey: js.UndefOr[String] = js.undefined
}
object CAConfig {
  
  inline def apply(): CAConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAConfig]
  }
  
  extension [Self <: CAConfig](x: Self) {
    
    inline def setExternalCAs(value: js.Array[ExternalCA]): Self = StObject.set(x, "ExternalCAs", value.asInstanceOf[js.Any])
    
    inline def setExternalCAsUndefined: Self = StObject.set(x, "ExternalCAs", js.undefined)
    
    inline def setExternalCAsVarargs(value: ExternalCA*): Self = StObject.set(x, "ExternalCAs", js.Array(value :_*))
    
    inline def setForceRotate(value: Double): Self = StObject.set(x, "ForceRotate", value.asInstanceOf[js.Any])
    
    inline def setForceRotateUndefined: Self = StObject.set(x, "ForceRotate", js.undefined)
    
    inline def setNodeCertExpiry(value: Duration): Self = StObject.set(x, "NodeCertExpiry", value.asInstanceOf[js.Any])
    
    inline def setNodeCertExpiryUndefined: Self = StObject.set(x, "NodeCertExpiry", js.undefined)
    
    inline def setSigningCACert(value: String): Self = StObject.set(x, "SigningCACert", value.asInstanceOf[js.Any])
    
    inline def setSigningCACertUndefined: Self = StObject.set(x, "SigningCACert", js.undefined)
    
    inline def setSigningCAKey(value: String): Self = StObject.set(x, "SigningCAKey", value.asInstanceOf[js.Any])
    
    inline def setSigningCAKeyUndefined: Self = StObject.set(x, "SigningCAKey", js.undefined)
  }
}
