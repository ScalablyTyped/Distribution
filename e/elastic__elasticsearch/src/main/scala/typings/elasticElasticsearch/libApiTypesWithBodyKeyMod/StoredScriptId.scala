package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredScriptId
  extends StObject
     with ScriptBase
     with _Script
     with _SecurityRoleTemplateScript {
  
  var id: Id
}
object StoredScriptId {
  
  inline def apply(id: Id): StoredScriptId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredScriptId]
  }
  
  extension [Self <: StoredScriptId](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
