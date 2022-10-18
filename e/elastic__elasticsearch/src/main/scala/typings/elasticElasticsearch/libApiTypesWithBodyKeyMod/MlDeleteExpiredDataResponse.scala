package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteExpiredDataResponse extends StObject {
  
  var deleted: Boolean
}
object MlDeleteExpiredDataResponse {
  
  inline def apply(deleted: Boolean): MlDeleteExpiredDataResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteExpiredDataResponse]
  }
  
  extension [Self <: MlDeleteExpiredDataResponse](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
  }
}
