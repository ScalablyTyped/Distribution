package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Instance. */
trait IInstance extends StObject {
  
  /** Instance config */
  var config: js.UndefOr[String | Null] = js.undefined
  
  /** Instance createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Instance displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** Instance endpointUris */
  var endpointUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Instance labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** Instance name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Instance nodeCount */
  var nodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /** Instance processingUnits */
  var processingUnits: js.UndefOr[Double | Null] = js.undefined
  
  /** Instance state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.Instance.State * / any */ String) | Null
  ] = js.undefined
  
  /** Instance updateTime */
  var updateTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IInstance {
  
  inline def apply(): IInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInstance]
  }
  
  extension [Self <: IInstance](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigNull: Self = StObject.set(x, "config", null)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpointUris(value: js.Array[String]): Self = StObject.set(x, "endpointUris", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrisNull: Self = StObject.set(x, "endpointUris", null)
    
    inline def setEndpointUrisUndefined: Self = StObject.set(x, "endpointUris", js.undefined)
    
    inline def setEndpointUrisVarargs(value: String*): Self = StObject.set(x, "endpointUris", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountNull: Self = StObject.set(x, "nodeCount", null)
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setProcessingUnits(value: Double): Self = StObject.set(x, "processingUnits", value.asInstanceOf[js.Any])
    
    inline def setProcessingUnitsNull: Self = StObject.set(x, "processingUnits", null)
    
    inline def setProcessingUnitsUndefined: Self = StObject.set(x, "processingUnits", js.undefined)
    
    inline def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.Instance.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: ITimestamp): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
