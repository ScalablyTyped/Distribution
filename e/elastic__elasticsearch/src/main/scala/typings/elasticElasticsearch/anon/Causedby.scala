package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Causedby extends StObject {
  
  var caused_by: Reason = js.native
  
  var reason: String = js.native
  
  var `type`: String = js.native
}
object Causedby {
  
  @scala.inline
  def apply(caused_by: Reason, reason: String, `type`: String): Causedby = {
    val __obj = js.Dynamic.literal(caused_by = caused_by.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Causedby]
  }
  
  @scala.inline
  implicit class CausedbyMutableBuilder[Self <: Causedby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaused_by(value: Reason): Self = StObject.set(x, "caused_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
