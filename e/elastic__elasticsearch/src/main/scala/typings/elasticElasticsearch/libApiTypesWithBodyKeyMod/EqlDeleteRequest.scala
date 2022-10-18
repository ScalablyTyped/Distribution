package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlDeleteRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object EqlDeleteRequest {
  
  inline def apply(id: Id): EqlDeleteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlDeleteRequest]
  }
  
  extension [Self <: EqlDeleteRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
