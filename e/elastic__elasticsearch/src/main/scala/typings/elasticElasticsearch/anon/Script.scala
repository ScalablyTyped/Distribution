package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.StoredScript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script extends StObject {
  
  var script: StoredScript
}
object Script {
  
  inline def apply(script: StoredScript): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  
  extension [Self <: Script](x: Self) {
    
    inline def setScript(value: StoredScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
