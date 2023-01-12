package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotInfoFeatureState extends StObject {
  
  var feature_name: String
  
  var indices: Indices
}
object SnapshotInfoFeatureState {
  
  inline def apply(feature_name: String, indices: Indices): SnapshotInfoFeatureState = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotInfoFeatureState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotInfoFeatureState] (val x: Self) extends AnyVal {
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
