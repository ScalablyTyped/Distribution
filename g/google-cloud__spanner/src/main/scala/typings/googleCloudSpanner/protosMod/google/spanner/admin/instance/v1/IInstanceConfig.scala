package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an InstanceConfig. */
trait IInstanceConfig extends StObject {
  
  /** InstanceConfig displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** InstanceConfig leaderOptions */
  var leaderOptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** InstanceConfig name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** InstanceConfig replicas */
  var replicas: js.UndefOr[js.Array[IReplicaInfo] | Null] = js.undefined
}
object IInstanceConfig {
  
  inline def apply(): IInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInstanceConfig]
  }
  
  extension [Self <: IInstanceConfig](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLeaderOptions(value: js.Array[String]): Self = StObject.set(x, "leaderOptions", value.asInstanceOf[js.Any])
    
    inline def setLeaderOptionsNull: Self = StObject.set(x, "leaderOptions", null)
    
    inline def setLeaderOptionsUndefined: Self = StObject.set(x, "leaderOptions", js.undefined)
    
    inline def setLeaderOptionsVarargs(value: String*): Self = StObject.set(x, "leaderOptions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicas(value: js.Array[IReplicaInfo]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasNull: Self = StObject.set(x, "replicas", null)
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: IReplicaInfo*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
