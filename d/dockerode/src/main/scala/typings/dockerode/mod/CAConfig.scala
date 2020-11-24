package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAConfig extends js.Object {
  
  var ExternalCAs: js.UndefOr[js.Array[ExternalCA]] = js.native
  
  var ForceRotate: js.UndefOr[Double] = js.native
  
  var NodeCertExpiry: js.UndefOr[Duration] = js.native
  
  var SigningCACert: js.UndefOr[String] = js.native
  
  var SigningCAKey: js.UndefOr[String] = js.native
}
object CAConfig {
  
  @scala.inline
  def apply(): CAConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAConfig]
  }
  
  @scala.inline
  implicit class CAConfigOps[Self <: CAConfig] (val x: Self) extends AnyVal {
    
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
    def setExternalCAsVarargs(value: ExternalCA*): Self = this.set("ExternalCAs", js.Array(value :_*))
    
    @scala.inline
    def setExternalCAs(value: js.Array[ExternalCA]): Self = this.set("ExternalCAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalCAs: Self = this.set("ExternalCAs", js.undefined)
    
    @scala.inline
    def setForceRotate(value: Double): Self = this.set("ForceRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRotate: Self = this.set("ForceRotate", js.undefined)
    
    @scala.inline
    def setNodeCertExpiry(value: Duration): Self = this.set("NodeCertExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeCertExpiry: Self = this.set("NodeCertExpiry", js.undefined)
    
    @scala.inline
    def setSigningCACert(value: String): Self = this.set("SigningCACert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningCACert: Self = this.set("SigningCACert", js.undefined)
    
    @scala.inline
    def setSigningCAKey(value: String): Self = this.set("SigningCAKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningCAKey: Self = this.set("SigningCAKey", js.undefined)
  }
}
