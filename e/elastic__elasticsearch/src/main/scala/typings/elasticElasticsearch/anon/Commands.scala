package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRerouteCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  var commands: js.UndefOr[js.Array[ClusterRerouteCommand]] = js.undefined
}
object Commands {
  
  inline def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  
  extension [Self <: Commands](x: Self) {
    
    inline def setCommands(value: js.Array[ClusterRerouteCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: ClusterRerouteCommand*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
