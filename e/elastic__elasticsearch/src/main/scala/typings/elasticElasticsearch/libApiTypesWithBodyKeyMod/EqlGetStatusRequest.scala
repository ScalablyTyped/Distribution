package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlGetStatusRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object EqlGetStatusRequest {
  
  inline def apply(id: Id): EqlGetStatusRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlGetStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlGetStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
