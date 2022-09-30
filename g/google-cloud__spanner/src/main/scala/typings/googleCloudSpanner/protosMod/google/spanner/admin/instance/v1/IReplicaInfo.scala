package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ReplicaInfo. */
trait IReplicaInfo extends StObject {
  
  /** ReplicaInfo defaultLeaderLocation */
  var defaultLeaderLocation: js.UndefOr[Boolean | Null] = js.undefined
  
  /** ReplicaInfo location */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /** ReplicaInfo type */
  var `type`: js.UndefOr[
    ReplicaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType * / any */ String) | Null
  ] = js.undefined
}
object IReplicaInfo {
  
  inline def apply(): IReplicaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReplicaInfo]
  }
  
  extension [Self <: IReplicaInfo](x: Self) {
    
    inline def setDefaultLeaderLocation(value: Boolean): Self = StObject.set(x, "defaultLeaderLocation", value.asInstanceOf[js.Any])
    
    inline def setDefaultLeaderLocationNull: Self = StObject.set(x, "defaultLeaderLocation", null)
    
    inline def setDefaultLeaderLocationUndefined: Self = StObject.set(x, "defaultLeaderLocation", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(
      value: ReplicaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
