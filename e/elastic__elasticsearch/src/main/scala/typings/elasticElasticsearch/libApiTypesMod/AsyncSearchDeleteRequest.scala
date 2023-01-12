package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchDeleteRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object AsyncSearchDeleteRequest {
  
  inline def apply(id: Id): AsyncSearchDeleteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncSearchDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
