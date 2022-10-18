package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAddBlockIndicesBlockStatus extends StObject {
  
  var blocked: Boolean
  
  var name: IndexName
}
object IndicesAddBlockIndicesBlockStatus {
  
  inline def apply(blocked: Boolean, name: IndexName): IndicesAddBlockIndicesBlockStatus = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAddBlockIndicesBlockStatus]
  }
  
  extension [Self <: IndicesAddBlockIndicesBlockStatus](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setName(value: IndexName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
