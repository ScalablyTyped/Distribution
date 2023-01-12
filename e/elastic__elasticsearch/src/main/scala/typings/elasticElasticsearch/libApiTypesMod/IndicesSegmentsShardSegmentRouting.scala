package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSegmentsShardSegmentRouting extends StObject {
  
  var node: String
  
  var primary: Boolean
  
  var state: String
}
object IndicesSegmentsShardSegmentRouting {
  
  inline def apply(node: String, primary: Boolean, state: String): IndicesSegmentsShardSegmentRouting = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSegmentsShardSegmentRouting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSegmentsShardSegmentRouting] (val x: Self) extends AnyVal {
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
