package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Causedby extends StObject {
  
  var caused_by: Reason
  
  var reason: String
  
  var `type`: String
}
object Causedby {
  
  inline def apply(caused_by: Reason, reason: String, `type`: String): Causedby = {
    val __obj = js.Dynamic.literal(caused_by = caused_by.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Causedby]
  }
  
  extension [Self <: Causedby](x: Self) {
    
    inline def setCaused_by(value: Reason): Self = StObject.set(x, "caused_by", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
