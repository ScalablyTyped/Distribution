package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInfo
  extends StObject
     with Meta {
  
  var DataPathPort: Double
  
  var DefaultAddrPool: js.Array[String]
  
  var ID: String
  
  var RootRotationInProgress: Boolean
  
  var Spec: typings.dockerode.mod.Spec
  
  var SubnetSize: Double
  
  var TLSInfo: typings.dockerode.mod.TLSInfo
}
object ClusterInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
    inline def setDataPathPort(value: Double): Self = StObject.set(x, "DataPathPort", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddrPool(value: js.Array[String]): Self = StObject.set(x, "DefaultAddrPool", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddrPoolVarargs(value: String*): Self = StObject.set(x, "DefaultAddrPool", js.Array(value*))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setRootRotationInProgress(value: Boolean): Self = StObject.set(x, "RootRotationInProgress", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    inline def setSubnetSize(value: Double): Self = StObject.set(x, "SubnetSize", value.asInstanceOf[js.Any])
    
    inline def setTLSInfo(value: TLSInfo): Self = StObject.set(x, "TLSInfo", value.asInstanceOf[js.Any])
  }
}
