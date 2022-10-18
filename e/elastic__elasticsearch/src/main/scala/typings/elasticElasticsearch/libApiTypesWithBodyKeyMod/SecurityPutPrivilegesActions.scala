package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutPrivilegesActions extends StObject {
  
  var actions: js.Array[String]
  
  var application: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
}
object SecurityPutPrivilegesActions {
  
  inline def apply(actions: js.Array[String]): SecurityPutPrivilegesActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutPrivilegesActions]
  }
  
  extension [Self <: SecurityPutPrivilegesActions](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
