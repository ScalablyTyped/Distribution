package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenPointInTimeResponse extends StObject {
  
  var id: Id
}
object OpenPointInTimeResponse {
  
  inline def apply(id: Id): OpenPointInTimeResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenPointInTimeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenPointInTimeResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
