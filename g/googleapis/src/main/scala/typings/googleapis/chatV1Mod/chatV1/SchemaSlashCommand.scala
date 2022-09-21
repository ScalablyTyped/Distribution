package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlashCommand extends StObject {
  
  /**
    * The id of the slash command invoked.
    */
  var commandId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlashCommand {
  
  inline def apply(): SchemaSlashCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlashCommand]
  }
  
  extension [Self <: SchemaSlashCommand](x: Self) {
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdNull: Self = StObject.set(x, "commandId", null)
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
  }
}
