package typings.elasticElasticsearch.libApiTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDeleteExpiredDataResponse] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
  }
}
