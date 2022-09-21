package typings.esbuildWasm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * Optional user-specified data that is passed through unmodified. You can
    * use this to stash the original error, for example.
    */
  var detail: Any
  
  var id: String
  
  var location: Location | Null
  
  var notes: js.Array[Note]
  
  var pluginName: String
  
  var text: String
}
object Message {
  
  inline def apply(detail: Any, id: String, notes: js.Array[Note], pluginName: String, text: String): Message = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], location = null)
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
