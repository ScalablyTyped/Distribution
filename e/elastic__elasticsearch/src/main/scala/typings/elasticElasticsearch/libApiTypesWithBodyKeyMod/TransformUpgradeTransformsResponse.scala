package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformUpgradeTransformsResponse extends StObject {
  
  var needs_update: integer
  
  var no_action: integer
  
  var updated: integer
}
object TransformUpgradeTransformsResponse {
  
  inline def apply(needs_update: integer, no_action: integer, updated: integer): TransformUpgradeTransformsResponse = {
    val __obj = js.Dynamic.literal(needs_update = needs_update.asInstanceOf[js.Any], no_action = no_action.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformUpgradeTransformsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformUpgradeTransformsResponse] (val x: Self) extends AnyVal {
    
    inline def setNeeds_update(value: integer): Self = StObject.set(x, "needs_update", value.asInstanceOf[js.Any])
    
    inline def setNo_action(value: integer): Self = StObject.set(x, "no_action", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: integer): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
