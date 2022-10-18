package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: String
}
object Indices {
  
  inline def apply(indices: String): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  extension [Self <: Indices](x: Self) {
    
    inline def setIndices(value: String): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
  }
}
