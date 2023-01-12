package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCloseJobResponse extends StObject {
  
  var closed: Boolean
}
object MlCloseJobResponse {
  
  inline def apply(closed: Boolean): MlCloseJobResponse = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCloseJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlCloseJobResponse] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
