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
  
  @scala.inline
  def apply(): CAConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAConfig]
  }
  
  @scala.inline
  implicit class CAConfigMutableBuilder[Self <: CAConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalCAs(value: js.Array[ExternalCA]): Self = StObject.set(x, "ExternalCAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalCAsUndefined: Self = StObject.set(x, "ExternalCAs", js.undefined)
    
    @scala.inline
    def setExternalCAsVarargs(value: ExternalCA*): Self = StObject.set(x, "ExternalCAs", js.Array(value :_*))
    
    @scala.inline
    def setForceRotate(value: Double): Self = StObject.set(x, "ForceRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRotateUndefined: Self = StObject.set(x, "ForceRotate", js.undefined)
    
    @scala.inline
    def setNodeCertExpiry(value: Duration): Self = StObject.set(x, "NodeCertExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCertExpiryUndefined: Self = StObject.set(x, "NodeCertExpiry", js.undefined)
    
    @scala.inline
    def setSigningCACert(value: String): Self = StObject.set(x, "SigningCACert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningCACertUndefined: Self = StObject.set(x, "SigningCACert", js.undefined)
    
    @scala.inline
    def setSigningCAKey(value: String): Self = StObject.set(x, "SigningCAKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningCAKeyUndefined: Self = StObject.set(x, "SigningCAKey", js.undefined)
  }
}
