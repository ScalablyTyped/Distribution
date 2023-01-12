package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgedResponseBase extends StObject {
  
  var acknowledged: Boolean
}
object AcknowledgedResponseBase {
  
  inline def apply(acknowledged: Boolean): AcknowledgedResponseBase = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgedResponseBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcknowledgedResponseBase] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
  }
}
