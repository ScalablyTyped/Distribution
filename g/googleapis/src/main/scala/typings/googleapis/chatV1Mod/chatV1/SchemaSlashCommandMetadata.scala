package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlashCommandMetadata extends StObject {
  
  /**
    * The Chat app whose command was invoked.
    */
  var bot: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The command id of the invoked slash command.
    */
  var commandId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the invoked slash command.
    */
  var commandName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicating whether the slash command is for a dialog.
    */
  var triggersDialog: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of slash command.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlashCommandMetadata {
  
  inline def apply(): SchemaSlashCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlashCommandMetadata]
  }
  
  extension [Self <: SchemaSlashCommandMetadata](x: Self) {
    
    inline def setBot(value: SchemaUser): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "bot", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdNull: Self = StObject.set(x, "commandId", null)
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameNull: Self = StObject.set(x, "commandName", null)
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setTriggersDialog(value: Boolean): Self = StObject.set(x, "triggersDialog", value.asInstanceOf[js.Any])
    
    inline def setTriggersDialogNull: Self = StObject.set(x, "triggersDialog", null)
    
    inline def setTriggersDialogUndefined: Self = StObject.set(x, "triggersDialog", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
