package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ClusterInfoMutableBuilder[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataPathPort(value: Double): Self = StObject.set(x, "DataPathPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddrPool(value: js.Array[String]): Self = StObject.set(x, "DefaultAddrPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddrPoolVarargs(value: String*): Self = StObject.set(x, "DefaultAddrPool", js.Array(value :_*))
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRotationInProgress(value: Boolean): Self = StObject.set(x, "RootRotationInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: Spec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetSize(value: Double): Self = StObject.set(x, "SubnetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTLSInfo(value: TLSInfo): Self = StObject.set(x, "TLSInfo", value.asInstanceOf[js.Any])
  }
}
