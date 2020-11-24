package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterInfo extends Meta {
  
  var DataPathPort: Double = js.native
  
  var DefaultAddrPool: js.Array[String] = js.native
  
  var ID: String = js.native
  
  var RootRotationInProgress: Boolean = js.native
  
  var Spec: typings.dockerode.mod.Spec = js.native
  
  var SubnetSize: Double = js.native
  
  var TLSInfo: typings.dockerode.mod.TLSInfo = js.native
}
object ClusterInfo {
  
  @scala.inline
  def apply(
    DataPathPort: Double,
    DefaultAddrPool: js.Array[String],
    ID: String,
    RootRotationInProgress: Boolean,
    Spec: Spec,
    SubnetSize: Double,
    TLSInfo: TLSInfo
  ): ClusterInfo = {
    val __obj = js.Dynamic.literal(DataPathPort = DataPathPort.asInstanceOf[js.Any], DefaultAddrPool = DefaultAddrPool.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], RootRotationInProgress = RootRotationInProgress.asInstanceOf[js.Any], Spec = Spec.asInstanceOf[js.Any], SubnetSize = SubnetSize.asInstanceOf[js.Any], TLSInfo = TLSInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInfo]
  }
  
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
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
    def setDataPathPort(value: Double): Self = this.set("DataPathPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddrPoolVarargs(value: String*): Self = this.set("DefaultAddrPool", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAddrPool(value: js.Array[String]): Self = this.set("DefaultAddrPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRotationInProgress(value: Boolean): Self = this.set("RootRotationInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: Spec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetSize(value: Double): Self = this.set("SubnetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTLSInfo(value: TLSInfo): Self = this.set("TLSInfo", value.asInstanceOf[js.Any])
  }
}
