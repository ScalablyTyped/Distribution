package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IStruct
import typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.IChildLink
import typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.IShortRepresentation
import typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PlanNode. */
trait IPlanNode extends StObject {
  
  /** PlanNode childLinks */
  var childLinks: js.UndefOr[js.Array[IChildLink] | Null] = js.undefined
  
  /** PlanNode displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** PlanNode executionStats */
  var executionStats: js.UndefOr[IStruct | Null] = js.undefined
  
  /** PlanNode index */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /** PlanNode kind */
  var kind: js.UndefOr[
    Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.PlanNode.Kind * / any */ String) | Null
  ] = js.undefined
  
  /** PlanNode metadata */
  var metadata: js.UndefOr[IStruct | Null] = js.undefined
  
  /** PlanNode shortRepresentation */
  var shortRepresentation: js.UndefOr[IShortRepresentation | Null] = js.undefined
}
object IPlanNode {
  
  inline def apply(): IPlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanNode]
  }
  
  extension [Self <: IPlanNode](x: Self) {
    
    inline def setChildLinks(value: js.Array[IChildLink]): Self = StObject.set(x, "childLinks", value.asInstanceOf[js.Any])
    
    inline def setChildLinksNull: Self = StObject.set(x, "childLinks", null)
    
    inline def setChildLinksUndefined: Self = StObject.set(x, "childLinks", js.undefined)
    
    inline def setChildLinksVarargs(value: IChildLink*): Self = StObject.set(x, "childLinks", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExecutionStats(value: IStruct): Self = StObject.set(x, "executionStats", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatsNull: Self = StObject.set(x, "executionStats", null)
    
    inline def setExecutionStatsUndefined: Self = StObject.set(x, "executionStats", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(
      value: Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.PlanNode.Kind * / any */ String)
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: IStruct): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setShortRepresentation(value: IShortRepresentation): Self = StObject.set(x, "shortRepresentation", value.asInstanceOf[js.Any])
    
    inline def setShortRepresentationNull: Self = StObject.set(x, "shortRepresentation", null)
    
    inline def setShortRepresentationUndefined: Self = StObject.set(x, "shortRepresentation", js.undefined)
  }
}
